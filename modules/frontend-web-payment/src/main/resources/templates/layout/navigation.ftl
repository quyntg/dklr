<!-- TODO Template Xây dựng navigation -->
<div id="menu_template" class="hidden">
	<#-- <div class="layout row wrap">
		<v-text-field
		  v-model=""
		  placeholder="Nhập mã hồ sơ"
		></v-text-field>

	</div> -->
    <div class="layout row wrap">
        <div class="flex xs12 ">
			<v-btn block color="my-0 btn-view">QUẢN LÝ THU PHÍ LỆ PHÍ</v-btn>
		</div>
    	<div class="flex xs12 mb-3 px-0 panel-dossier-navigation" jx-bind="listgroupFilter"></div>
	</div>
	<input type="file" name="inputfile_temp" id="inputfile_temp" style="display:none" />
</div>