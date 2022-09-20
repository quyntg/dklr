package com.fds.vr.business.service.indexer;

import com.liferay.portal.kernel.io.OutputStreamWriter;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ElasticQueryWrapUtil {
	private static final String ELASTIC_SERVER_API_URL = "http://localhost:9200/liferay-dklr-";
	private static Log _log = LogFactoryUtil.getLog(ElasticQueryWrapUtil.class);
	
	public static JSONObject POST(String body, String className, long conpanyId) {

		//_log.info("====START POST ES==== ");
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			URL url = new URL(ELASTIC_SERVER_API_URL + conpanyId + "/LiferayDocumentType/");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "Content-Type: application/json");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			_log.info("=====>conn " + conn);
			
			OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
			osw.write(body);
			osw.flush();
			osw.close();

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;

			StringBuilder sb = new StringBuilder();

			while ((output = br.readLine()) != null) {
				sb.append(output);
			}
			
			result = JSONFactoryUtil.createJSONObject(sb.toString());
		//	_log.info("====END POST ES==== ");
		} catch (JSONException e) {
			_log.error("JSONException Message: "+e);
			_log.info("=====>body " + body);
		} catch (IOException e) {
			_log.error("IOException Message: "+e);
			_log.info("=====>body " + body);
			
		}

		return result;
	}
	
	public static JSONObject DELETE(String id, long conpanyId) {

		//_log.info("====START DELETE ES==== ");
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			URL url = new URL(ELASTIC_SERVER_API_URL + conpanyId + "/LiferayDocumentType/" + id);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("DELETE");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
			osw.flush();
			osw.close();

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;

			StringBuilder sb = new StringBuilder();

			while ((output = br.readLine()) != null) {
				sb.append(output);
			}
			
			result = JSONFactoryUtil.createJSONObject(sb.toString());
		//	_log.info("====END DELETE ES==== ");
		} catch (JSONException e) {
			_log.error("JSONException Message: "+e);
		} catch (IOException e) {
			_log.error("IOException Message: "+e);
		}

		return result;
	}
	
	public static JSONObject POST_search(String body, String className, long conpanyId) {

		//_log.info("====START POST ES==== ");
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			URL url = new URL(ELASTIC_SERVER_API_URL + conpanyId + "/LiferayDocumentType/_search");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "Content-Type: application/json");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
			osw.write(body);
			osw.flush();
			osw.close();

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;

			StringBuilder sb = new StringBuilder();

			while ((output = br.readLine()) != null) {
				sb.append(output);
			}
			
			result = JSONFactoryUtil.createJSONObject(sb.toString());
		//	_log.info("====END POST ES==== ");
		} catch (JSONException e) {
			_log.error("JSONException Message: "+e);
		} catch (IOException e) {
			_log.error("IOException Message: "+e);
		}

		return result;
	}
	
	public static int DELETE(String key, String code, long conpanyId, String type_es) {

		int result = 1;
		
		String body = "{\"query\":{\"bool\":{\"must\":[{\"match\":{\"type_es\":\"" + type_es + "\"}},{\"match\":{\"" + key + "\":\"" + code + "\"}}]}}}" ;
		JSONObject arrayToDelete = POST_search(body, "", conpanyId);
		//Edit by Dungnv - Add condition arrayToDelete.length() > 0 to check is empty
		if(arrayToDelete.length() > 0) {
			if (arrayToDelete.getJSONObject("hits").getInt("total") > 0) {
				
				for (int index = 0; index < arrayToDelete.getJSONObject("hits").getJSONArray("hits").length(); index++) {
					try {
						String idRemove = arrayToDelete.getJSONObject("hits").getJSONArray("hits").getJSONObject(index).getString("_id");
						//_log.info("====START DELETE ES==== ");
						URL url = new URL(ELASTIC_SERVER_API_URL + conpanyId + "/LiferayDocumentType/" + idRemove);
	
						HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	
						conn.setRequestMethod("DELETE");
						conn.setDoInput(true);
						conn.setDoOutput(true);
						_log.info("=====>DELETE conn "+ conn);
						OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
						osw.flush();
						osw.close();
	
						BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
	
						String output;
	
						StringBuilder sb = new StringBuilder();
	
						while ((output = br.readLine()) != null) {
							sb.append(output);
						}
						
						result = 0;
						//_log.info("====END DELETE ES==== ");
					} catch (Exception e) {
						_log.error("JSONException Message: "+e);
						result = 1;
					}
				}
				
			} else if (arrayToDelete.getJSONObject("hits").getInt("total") <= 0) { 
				result = 0;
			}
		}else {
			result = 0; //Edit by Dungnv - Add condition arrayToDelete.length() > 0 to check is empty
		}
		return result;
	}
}
