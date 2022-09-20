<v-slide-x-transition>
<div class="row-header flex-break" style="justify-content: space-between;">

    <div class="background-triangle-big">Thông số kỹ thuật</div>
    <div>
        <v-btn color="primary" @click.native="stageFilterView = 'danh_sach_xe_da_xuat_xuong'"  class="mr-4 hidden-sm-and-down">Quay lại</v-btn>
    </div>

</div>

</v-slide-x-transition>


<v-slide-x-transition>

    <v-data-table
      v-bind:headers="headersTSKT"
      :items="danhSachTSKT"
      hide-actions
      class="elevation-1 table-xuatxuong"
    >
        <template slot="items" scope="props">
            <td>{{ props.index }}</td>
            <td>{{ props.item.specificationcode}}</td>  
            <td>{{ props.item.specificationname }}</td>
            <td>{{ props.item.specificationvalue }}</td>
            <td>{{ props.item.sequenceno }}</td>
            <td>{{ props.item.specificationbasicunit }}</td>
            <td>{{ props.item.specificationstandard }}</td>
            <td>{{ props.item.specificationgroup }}</td>
        </template>
  </v-data-table>

</v-slide-x-transition>