<template>
	<v-layout row wrap style="background: #fff;">
	  <v-flex xs12 sm12>
	    <table class="table-basic" style="height: 700px;overflow: auto;border: 1px solid #ccc;border-collapse: collapse;" border="1">
	    	<thead>
	    		<tr style="background: #14BEF0; color: #fff;">
	    			<th class="text-xs-center pl-1" style="width: 20%; ">
	    				<label>
	    					Phân quyền ký <br>
	    					chứng chỉ
	    				</label>
	    			</th>
	    			<th class="text-xs-left pl-1" v-for="(item, index) in listUsersRole">
	    				<label>{{item['title'] || ''}}</label> <br>
	    				<label>{{item['fullName'] || ''}}</label> <br>
	    				<label>{{item['email'] || ''}}</label> <br>
	    				<a href="javascript:;" style="color: #fff; cursor: pointer; font-weight: bold; text-decoration: underline;" @click="editRoleUser(item)">Sửa</a>
	    			</th>
	    		</tr>
	    	</thead>

	    	<tbody>
	    		<tr v-for="(itemClass, indexClass) in listClass">
					<td class="text-xs-left pl-1 py-2" v-if="itemClass['level'] == 1">
						{{itemClass['processName']}}
					</td>
					<td class="text-xs-left pl-1 py-2" v-else-if="itemClass['level'] == 2" style="padding-left: 20px!important;">
						{{itemClass['itemName']}}
					</td>
					<td class="text-xs-left pl-1" v-if="itemClass['level'] == 1 && itemClass['dictitem'].length != 0" :colspan="listUsersRole.length">
					</td>
					<td class="text-xs-left pl-1" v-for="(itemRoleUser, indexRoleUser) in listUsersRole" v-else>
						<v-icon
							v-if="itemClass['mappingUserIds'] && itemClass['mappingUserIds'].includes(itemRoleUser['mappingUserId'])"
							size="19"
							style="font-size: 18px"
							color="green"
							>
							check_circle
						</v-icon>
					</td>
	    		</tr>
	    	</tbody>
	    </table>
	  </v-flex>
	</v-layout>
</template>