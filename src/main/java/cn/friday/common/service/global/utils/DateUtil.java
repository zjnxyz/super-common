package cn.friday.common.service.global.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static String getCurrentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

	public static String getBeforeTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		return sdf.format(calendar.getTime());
	}

	public static String getBeforeDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(calendar.getTime());
	}

	public static String getDate(int offset) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, offset);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(calendar.getTime());
	}

	public static String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}

	public static Date changeLongToDate(long date) {
		return new Date(date);
	}

	public static String formateDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	public static String changeLongToString(long date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date(date));
	}

	public static long getCurrentTimeLong() {
		return new Date().getTime();
	}

	/**
	 * 把日期字符串转成开始时间
	 * @author Ljj
	 * @CreateTime 2015年3月27日 下午7:01:57
	 * 
	 * @param date
	 * @return
	 */
	public static Date getBeginDate(String date) {
		Date retVal = null;
		if (date.matches("\\d{4}\\-\\d{1,2}\\-\\d{1,2}")) {
			date += " 00:00:00";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			retVal = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * 把日期字符串转成结束时间
	 * @author Ljj
	 * @CreateTime 2015年3月27日 下午7:02:56
	 * 
	 * @param date
	 * @return
	 */
	public static Date getEndDate(String date) {
		Date retVal = null;
		if (date.matches("\\d{4}\\-\\d{1,2}\\-\\d{1,2}")) {
			date += " 23:59:59";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			retVal = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return retVal;
	}

	
	public static Date changStringToDate(String date) {
		Date retVal = null;
		if (date.matches("\\d{4}\\-\\d{1,2}\\-\\d{1,2}")) {
			date += " 00:00:00";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			retVal = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return retVal;
	}
}
