<div>
	<table>
		<thead>
			<tr>
				<th>STT <br> NO</th>
				<th>NỘI DUNG ĐÁNH GIÁ (ASSESSMENT CONTENTS)</th>
				<th>KQ <br>(Result)</th>
				<th>KL <br>(Conclusion)</th>
			</tr>
		</thead>
		<tbody>
			<tr v-for="(item, index) in part1" v-if="!item['items']">
				<td>{{item['stt']}}</td>
				<td colspan="3" v-html="item['noi_dung']"></td>
			</tr>
			<tr v-else-if="item['items']" v-for="(itemRd, indexRd) in item['items']">
				<td>{{item['stt']}}</td>
				<td colspan="2" v-html="item['noi_dung']"></td>
				<td :rowspan="item['items']['length'] + 1"></td>
				<td>{{itemRd['noi_dung']}}</td>
				<td :rowspan="item['items']['length']" v-if="indexRd === 0">
					<v-text-field
					  v-model="detailCOP['']"
					></v-text-field>
				</td>
			</tr>
		</tbody>
	</table>
</div>