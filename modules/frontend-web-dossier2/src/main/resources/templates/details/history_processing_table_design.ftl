<div id="list_history_processing_template" class="hidden">
	<template slot="items" slot-scope="props">
		<td style="padding-top: 15px;">{{ props.index + 1 }}</td>
		<td style="padding-top: 15px;" class="text-xs-left">
		
			<p> Ông/bà <b>{{ props.item.author }}</b> 
			<span class="text-blue">( {{ props.item.payload.stepName }} )</span>
 			<br/>
			<span class="text-light-gray">{{ props.item.createDate }}</span>
			</p>
			<span>Ý kiến: </span> <span v-html="props.item.content"></span> <br>
			
			<p	
				class="history__download__link"
				v-for="file in props.item.payload.files"
				:key="file.fileEntryId"
				@click.prevent.stop="downloadFile(file.fileEntryId)"
			>
				<v-icon>file_download</v-icon> 
				{{file.fileName}}
			</p>

		</td>
	</template>
</div>

<style>
	.history__download__link:hover{
	background-color: whitesmoke;
	cursor: pointer;
	font-family: 'Roboto-Bold';
	border-radius: 4px;
	}
</style>