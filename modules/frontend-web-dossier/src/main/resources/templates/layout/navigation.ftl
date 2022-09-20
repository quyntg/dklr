<!-- TODO Template Xây dựng navigation -->
<div id="menu_template">
  <div class="layout wrap">
    <div class="flex xs12 " v-if="!traCuuFilter" jx-bind="serviceInfoFilter"></div>
    <div class="flex xs12 " v-if="!traCuuFilter" jx-bind="applicantNameFilter"></div>
    <div class="flex xs12 mb-2" v-if="!traCuuFilter" jx-bind="dossierNoFilter"></div>
    <v-expansion-panel light class="panel-dossier-navigation">
      <v-expansion-panel-content :key="1" class="mb-0">
        <div slot="header" @click="filterAllDossierWithOutStatus()" v-html="'HỒ SƠ CẦN XỬ LÝ'"></div>
        <div class="flex xs12 status-dossier-navigation" jx-bind="listgroupHoSoFilter"></div>
      </v-expansion-panel-content>

      <v-expansion-panel-content :key="100 + index1" :value="true" v-for="(itemList, index1) in listGroupMenus" v-if="itemList.hasOwnProperty('lsGroupMenus') && itemList['lsGroupMenus'].length > 0 && showGroupMenus">
        <div slot="header" v-html="itemList.itemName"><!-- HỒ SƠ CẦN XỬ LÝ --></div>
        <div class="flex xs12 status-dossier-navigation">
          <v-list>
            <v-list-tile avatar v-for="(item, index2) in itemList.lsGroupMenus" v-bind:key="item.title" @click="groupHoSoFilter(item)" :class="{'list--group__header--active': indexGroupMenu === index1 && indexSelectMenu === index2}">
              <v-list-tile-action>
                <v-icon v-if="itemList.lsGroupMenus && itemList.lsGroupMenus['length']" v-html="'folder'"></v-icon>
              </v-list-tile-action>
              <v-list-tile-content>
                <v-list-tile-title v-html="item.title"></v-list-tile-title>
                <span class="status__counter" v-html="item.count ? item.count : 0"></span>
              </v-list-tile-content>
            </v-list-tile>
          </v-list>
        </div>
      </v-expansion-panel-content>

      <v-expansion-panel-content :key="2">
        <div slot="header" @click="filterTraCuu()" v-html="'TRA CỨU'"></div>
        <div class="flex xs12 tracuu-dossier-navigation" jx-bind="listgroupTraCuuFilter"></div>
      </v-expansion-panel-content>

      <v-expansion-panel-content :key="3">
        <div slot="header" v-html="'THÔNG TIN DOANH NGHIỆP'"></div>
        <div class="flex xs12 tracuu-dossier-navigation" jx-bind="listgroupQuanTriFilter"></div>
      </v-expansion-panel-content>

      <v-expansion-panel-content :key="4">
        <div slot="header" v-html="'BÁO CÁO THỐNG KÊ'"></div>
        <div class="flex xs12 tracuu-dossier-navigation" jx-bind="listgroupBaoCaoFilter"></div>
      </v-expansion-panel-content>

      <v-expansion-panel-content :key="5">
        <div slot="header" v-html="'Xuất xưởng'"></div>
        <div class="flex xs12 tracuu-dossier-navigation">
          <v-list>
            <v-list-tile avatar v-for="(item, index2) in groupXuatXuong" v-bind:key="item.title" @click="groupXuatXuongFilter(item)">
              <v-list-tile-content>
                <v-list-tile-title v-html="item.title"></v-list-tile-title>
              </v-list-tile-content>
            </v-list-tile>
          </v-list>
        </div>
      </v-expansion-panel-content>

      <v-expansion-panel-content :key="6">
        <div slot="header" @click="chuyenDoiDuLieu()" v-html="'Chuyển đổi dữ liệu'"></div>
        <div class="flex xs12 tracuu-dossier-navigation">
          <v-list>
            <#-- <v-list-tile avatar @click="chuyenDoiDuLieu()">
              <v-list-tile-content>
                <v-list-tile-title>{{item.title}}</v-list-tile-title>
              </v-list-tile-content>
            </v-list-tile> -->
          </v-list>
        </div>
      </v-expansion-panel-content>

      
    </v-expansion-panel>
  </div>
</div>