<v-slide-x-transition>

<div class="row-header flex-break" v-if="!detailPage && !detailRegistPage">

    <div class="background-triangle-big"> Đổi mật khẩu, thư điện tử</div>

    <div class="layout row wrap header_tools w-100-xs">

        <div class="flex w-100-xs" jx-bind="keywordsSearchDsDoanhNghiepDoiTaiKhoan"></div>

        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen_exit</v-icon></v-btn>
    </div>

</div>

</v-slide-x-transition>

<v-slide-x-transition>

    <div v-if="loadingDsDoanhNghiepDoiTaiKhoan" class="text-xs-center" style="width: 100%;">
        <v-progress-circular indeterminate v-bind:size="70" v-bind:width="2" color="purple"></v-progress-circular>
    </div>
    <div style="width: 100%;" class="text-xs-right" v-else>
        <v-data-table
        :headers="headersDsDoanhNghiepDoiTaiKhoan"
        :items="itemsDsDoanhNghiepDoiTaiKhoan"
        no-data-text="Không có dữ liệu"
        hide-actions
        class="table__overflow ml-0"
        loading="true"
        hide-actions
        >
        <template slot="headers" slot-scope="props">
            <tr>
                <th v-for="header in props.headers" :key="header.text"
                :class="['column text-xs-center']" v-html="header.text"
                >
                <!-- {{ header.text }} -->
            </th>
        </tr>
    </template>
    <template slot="items" slot-scope="props">
        <td style="padding: 8px 0px 8px 0px; width: 3%; " class="text-xs-center">
            {{ pageDsDoanhNghiepDoiTaiKhoan * 15 - 15 + props.index + 1 }}
        </td>
        <td style="padding: 8px;" class="text-xs-center">
            {{props.item.applicantName}}
        </td>
        <td style="padding: 8px; width: 30%;" class="text-xs-center">
            {{props.item.contactEmail}}
        </td>
        <td style="padding: 8px; width: 40%;" class="text-xs-center">
            {{props.item.applicantIdNo}}
        </td>
        <td style="padding: 8px; width: 10%;" class="text-xs-center">
            <v-icon class="mr-2" style="cursor: pointer; font-size: 16px;" @click="doiThongTinTaiKhoan(props.item)">edit</v-icon>
        </td>
    </template>
    </v-data-table>
    <v-pagination :length="lengthDsDoanhNghiepDoiTaiKhoan" v-model="pageDsDoanhNghiepDoiTaiKhoan" @input="changePageDsDoanhNghiepDoiTaiKhoan" class="mt-3"></v-pagination>
    </div>
</v-slide-x-transition>