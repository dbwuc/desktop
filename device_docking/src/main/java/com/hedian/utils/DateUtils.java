package com.hedian.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc: 时间转换
 * @Author: HC
 * @Since: 2021/2/25
 */
public class DateUtils {

    /**
     * 时间转换为字符串
     * @param time
     * @return
     */
    public static String dateToString(Date time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(time);
    }

    /**
     *  字符串转时间
     * @param str
     * @return
     * @throws ParseException
     */
    public static Date stringToDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(str);
    }
}
