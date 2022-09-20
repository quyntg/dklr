/**
 * 
 */
package com.fds.vr.service.util;

import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.TimeZoneUtil;
import com.liferay.portal.kernel.util.Validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author ddung
 *
 */
public class APIDateTimeUtil {
	public static final String _TIMESTAMP = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	public static final String _NORMAL_PARTTERN = "dd/MM/yyyy HH:mm:ss";
	public static final String _ALPACA_PARTTERN = "dd/MM/yyyy HH:mm";
	public static final String _NORMAL_DATE = "dd/MM/yyyy";
	public static final String _LUCENE_PATTERN = "yyyyMMddHHmmss";
	private static final String PATTERN_DATE = "dd-MM-yyyy HH:mm:ss";
	private static final String PATTERN_DATE_2 = "dd/MM/yyyy HH:mm:ss";
	private static final String PATTERN_DATE_3 = "dd/MM/yyyy";

	public static Date parseStringToDate(String strDate) {

		try {
			SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE);
			return df.parse(strDate);
		} catch (ParseException e) {

			try {
				SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_2);
				return df.parse(strDate);
			} catch (Exception e2) {
				try {
					SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_3);
					return df.parse(strDate);
				} catch (Exception e3) {

				}
			}

			// _log.error(e);
			return null;
		}

	}

	public static String convertNormalDateToLuceneDate(String normal) {
		if (Validator.isNull(normal)) {
			return StringPool.BLANK;
		}
		String[] splitD = normal.split("/");
		if (splitD.length != 3 || splitD[1].length() > 2 || splitD[0].length() > 2) {
			return StringPool.BLANK;
		}
		String year = splitD[2];
		String month = (splitD[1].length() == 1) ? "0" + splitD[1] : splitD[1];
		String day = (splitD[0].length() == 1) ? "0" + splitD[0] : splitD[0];

		return year + month + day;
	}

	public static String convertDateToString(Date date) {
		return convertDateToString(date, _NORMAL_PARTTERN);
	}

	public static String convertDateToString(Date date, String pattern) {
		DateFormat dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(pattern);

		if (Validator.isNull(date) || Validator.isNull(pattern)) {
			return StringPool.BLANK;
		}

		dateFormat.setTimeZone(TimeZoneUtil.getTimeZone("Asia/Ho_Chi_Minh"));

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);

		return dateFormat.format(calendar.getTime());
	}

	public static Date convertStringToDate(String source, String pattern) {

		if (Validator.isNull(source) || Validator.isNull(pattern)) {
			return null;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		try {
			return sdf.parse(source);
		} catch (Exception e) {
			return null;
		}

	}
}
