<!-- TODO paymentViewJX template one page view List detail template -->
<div id="activity_expand_list_template" class="hidden">
	<template slot="items" slot-scope="props">
	
		<td style="padding-top: 2px;"> <v-checkbox primary hide-details v-model="props.selected" ></v-checkbox> </td>

		<td style="padding-top: 8px; padding-left: 0px;;" class="text-xs-center">
			<a href="javascript:;">
			{{ paymentListpage * 15 - 15 + props.index + 1 }}
			</a>
		</td>

		<td style="padding-top: 8px; padding-left: 0px;;">
			<a href="javascript:;" class="pl-1" @click.prevent.stop="toPaymentDetail(props.item)">
				{{ props.item.serviceName }}
			</a>
		</td>

		<td style="padding-top: 8px; padding-left: 0px; padding-right: 0px;" class="text-xs-center" v-on:click.native="toPaymentDetail(props.item)">
			<a href="javascript:;" @click.prevent.stop="toPaymentDetail(props.item)">
			{{ props.item.invoiceNo }} <br/>
			{{ props.item.paymentMethod }}
			</a>
		</td>
		<td style="padding-top: 8px;" class="text-xs-center">{{ props.item.createDate }}</td>

		<td style="padding-top: 8px;" class="text-xs-right red--text" v-on:click.native="toPaymentDetail(props.item)">{{ props.item.paymentAmount | money }} VNĐ</td>

		<td style="padding-top: 8px;" class="text-xs-left" v-on:click.native="toPaymentDetail(props.item)">{{ props.item.applicantName }}</td>

		<td style="padding-top: 8px; padding-left: 0px; padding-right: 0px;" class="text-xs-center" v-on:click.native="toPaymentDetail(props.item)">
			{{ props.item.dossierIdCTN }} <br/>
			{{ props.item.dossierNo }} <br/>
			{{ props.item.dossierReferenceNo }} 
		</td>

		<td style="padding-top: 5px;" class="text-xs-left">

		<span v-html="props.item.briefNote"></span>
		<!-- <v-btn v-on:click.native="toPaymentDetail(props.item)" flat class="mx-0 my-0" color="grey darken-1">Chi tiết <v-icon>forward</v-icon>
		</v-btn> -->
		
		</td>
	</template>
</div>