<div id="list_document_out_template" class="hidden">
	<v-layout wrap class="px-4 align-center-flex row-list-style"> 
		<v-flex xs9 class="pt-2">
			<span class="text-bold" style="position: absolute;">{{index + 1}}.</span>
			<div style="margin-left: 30px;"><span @click.prevent="viewOnNewTab(item)" style="cursor: pointer;">{{item.partName}}</span></div>
		</v-flex>
		<v-flex xs3 class="text-right">

			<v-btn color="primary" fab small dark class="small-btn-x" v-if="item['eform'] || item['hasForm']" @click="showFormBanKhaiTPHS(item)">
				<v-icon style="font-size: 15px;">visibility</v-icon>
			</v-btn>

			<v-btn color="primary" fab small dark class="small-btn-x" v-if="item.counter && item.counter !== '0'" @click="downloadItemsWithFileName(item)">
				<v-icon style="font-size: 15px;">download</v-icon>
			</v-btn>

			<v-btn color="primary" fab small dark class="small-btn-x" v-on:click.native="viewDossierFileVersionNewTabOrWindow(item)">
				{{item.counter}}
			</v-btn>
		</v-flex>
		<v-flex xs12 sm3 v-if="item['historyDossierPart'] && item['historyDossierPart']['length']">
		</v-flex>
		<v-flex xs12 sm6 v-if="item['historyDossierPart'] && item['historyDossierPart']['length']">
		  <v-data-table
            v-bind:headers="headersHistoryDossierPart"
            v-bind:items="item['historyDossierPart']"
            v-model="selected"
            item-key="name"
            no-data-text="Không có dữ liệu"
            select-all
            class="table__overflow pt-2"
            hide-actions
            >
            <template slot="headers" slot-scope="props">
              <tr>
                <th v-for="header in props.headers" :key="header.text"
                :class="['column text-xs-center']"
                >
                {{ header.text }}
              </th>
            </tr>
          </template>
          <template slot="items" slot-scope="props">
            <tr>
              <td class="pt-2" style="width: 5%;">{{ props['index'] + 1 }}</td>
              <#-- <td class="pt-2">{{ props.item['contentType'] || '' }}</td> -->
              <td class="text-xs-center pt-2">{{ props.item['createdDate'] || '' }}</td>
              <td class="text-xs-center pt-2">
              	<span style="color: blue; cursor: pointer;" @click="viewHistoryPdf(item, props.item)">Tải về</span>
              </td>
            </tr>
          </template>
        </v-data-table>
		</v-flex>
		<v-flex xs12 sm3 v-if="item['historyDossierPart'] && item['historyDossierPart']['length']">
		</v-flex>

		<v-flex xs12 sm1 v-if="item['historyDossierCapPhieu'] && item['historyDossierCapPhieu']['length']">
		  
		</v-flex>
		<v-flex xs12 sm10 v-if="item['historyDossierCapPhieu'] && item['historyDossierCapPhieu']['length']">
      <v-data-table
            v-bind:headers="headersBBKiemTraGS"
            v-bind:items="item['historyDossierCapPhieu']"
            v-model="selected"
            item-key="name"
            no-data-text="Không có dữ liệu"
            select-all
            class="table__overflow pt-2"
            hide-actions
            >
            <template slot="headers" slot-scope="props">
              <tr>
                <th v-for="header in props.headers" :key="header.text"
                :class="['column text-xs-center']"
                >
                {{ header.text }}
              </th>
            </tr>
          </template>
          <template slot="items" slot-scope="props">
            <tr>
              <td class="pt-2" style="width: 5%;">{{ props['index'] + 1 }}</td>
              <td class="pt-2">{{ props.item['inspectionSeq'] || 0 }}</td>
              <td class="pt-2">{{ props.item['inspectionRecordNo'] || '' }}</td>
              <td class="pt-2">{{ props.item['inspectionRecordDate'] || '' }}</td>
              <td class="pt-2">{{ props.item['postReviewRecordDate'] || '' }}</td>
              <td class="text-xs-center pt-2">{{ props.item['totalQuantity'] || '0' }}</td>
              <td class="text-xs-center pt-2"><a href="javascript:;" @click="xemBBGS(props.item['deliverableFileEntryId'])">Xem pdf</a></td>
            </tr>
          </template>
        </v-data-table>
		</v-flex>
		<v-flex xs12 sm1 v-if="item['historyDossierCapPhieu'] && item['historyDossierCapPhieu']['length']">
		  
		</v-flex>
	</v-layout>
</div>

<style>
	.btn__link_normal {
		text-transform: none;
    	font-weight: normal;
		display: inline-table;
		height: auto;
		margin: 0px;
		position: relative;
	}
	.btn__link_normal .btn__content {
		white-space: normal;
		text-align: left;
	}
	.btn__link_delete {
		min-width: 60px !important;
	}
	.btn__link_delete .btn__content {
		color: #c62828 !important;
	}
</style>