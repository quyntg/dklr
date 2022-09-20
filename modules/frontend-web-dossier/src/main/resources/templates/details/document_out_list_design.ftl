<div id="list_document_out_template" class="hidden">
	<v-layout wrap class="px-4 align-center-flex row-list-style"> 
		<v-flex xs11 class="pt-2">
			<!-- <span class="text-bold" style="position: absolute;">{{index + 1}}.</span>  -->
			<div style="margin-left: 30px;"><span @click.prevent="viewOnNewTab(item)" style="cursor: pointer;">{{item.partName}}</span></div>
		</v-flex>
		<v-flex xs1 class="text-right">
			<v-btn color="primary" fab small dark class="small-btn-x" v-on:click.native="viewDossierFileVersionNewTabOrWindow(item)">
				{{item.counter}}
			</v-btn>
		</v-flex>
		<v-flex xs12 sm3>
		</v-flex>
		<v-flex xs12 sm6 v-if="item['historyDossierPart'] && item['historyDossierPart']['length']">
		  <table border="1" class="table-simple">
              <thead>
                <tr>
                  <th class="text-xs-center">
                    Lần
                  </th>
                  <th class="text-xs-center">Nội dung</th>
                  <th class="text-xs-center">Ngày giờ thông báo</th>
                  <th class="text-xs-center">Hành động</th>
                </tr>
              </thead>

              <tbody>
                <tr v-for="(itemHistory, index) in item['historyDossierPart']" :key="item['partNo'] + index">
                  <td class="text-xs-center">{{index + 1}}</td>
                  <td class="text-xs-center">
                    {{itemHistory['contentType']}}
                  </td>
                  <td class="text-xs-center">
                    {{itemHistory['createdDate']}}
                  </td>
                  <td class="text-xs-center">
                    <span style="color: blue; cursor: pointer;" @click="viewHistoryPdf(itemHistory)">Xem</span>
                  </td>
                </tr>
              </tbody>
            </table>
		</v-flex>
		<v-flex xs12 sm3>
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