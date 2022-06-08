package com.jeethink.system.service.test;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

/**
 * Created by Simple on 2017/11/7.
 */
public class DateHelper {
    /**
     *
     * @param date
     * @return
     */

    public static final String FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static Date getDate(Date date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = format.format(date);
            return format.parse(dateString);
        } catch (ParseException ex) {
        }
        return date;
    }
    /**
     * 获取当前年月日
     * @param date
     * @return
     */
    public static String getYearMonthDay(Date date) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        return fmt.format(date);
    }
    /**
     * 获取当前季度
     *
     */
    public static int getQuarter() {
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH) + 1;
        int quarter = 0;
        if (month >= 1 && month <= 3) {
            quarter = 1;
        } else if (month >= 4 && month <= 6) {
            quarter = 2;
        } else if (month >= 7 && month <= 9) {
            quarter = 3;
        } else {
            quarter = 4;
        }
        return quarter;
    }
    /**
     * @Author: umizhang
     * @Title: getStartOrEndDayOfQuarter
     * @Description TODO 获取本季度的第一天或最后一天
     * @Date: 2019/7/23 13:46
     * @Param: [today, isFirst: true 表示开始时间，false表示结束时间]
     * @return: java.lang.String
     * @Exception:
     */
    public static String getStartOrEndDayOfQuarter(LocalDate today, Boolean isFirst){
        LocalDate resDate = LocalDate.now();
        if (today == null) {
            today = resDate;
        }
        Month month = today.getMonth();
        Month firstMonthOfQuarter = month.firstMonthOfQuarter();
        Month endMonthOfQuarter = Month.of(firstMonthOfQuarter.getValue() + 2);
        if (isFirst) {
            resDate = LocalDate.of(today.getYear(), firstMonthOfQuarter, 1);
        } else {
            resDate = LocalDate.of(today.getYear(), endMonthOfQuarter, endMonthOfQuarter.length(today.isLeapYear()));
        }
        return resDate.toString();
    }


    public static Long getLongDateZeroTime(Date date) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMM00000000");
        return Long.valueOf(fmt.format(date));
    }

    /**
     * 获取当年的最后一天
     * @return
     */
    public static Date getCurrYearLast(){
        Calendar currCal=Calendar.getInstance();
        int currentYear = currCal.get(Calendar.YEAR);
        return getYearLast(currentYear);
    }
    /**
     * 获取某年最后一天日期
     * @param year 年份
     * @return Date
     */
    public static Date getYearLast(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date currYearLast = calendar.getTime();

        return currYearLast;
    }
    /**
     * 将Date转成时间戳（精确到秒）
     * @param date
     * @return
     */
    public static int getUnixTimesByDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (int) (calendar.getTimeInMillis() / 1000L);
    }

    /**
     * 将字符串日期转成时间戳（精确到秒）
     *
     * @param strDate
     * @return
     */
    public static int getUnixTimesByDate(String strDate) {
        return initDateStartToInt(strDate, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 将时间戳转成Date
     *
     * @param unixTimes
     * @return
     */
    public static Date getDateByUnixTimes(int unixTimes) {
        Long lt = Long.valueOf(unixTimes + "000");
        Date date = new Date(lt);
        return date;
    }

    /**
     * 将字符串日期转成Date
     * @param strDate
     * @return
     */
    public static Date getDateByStrDate(String strDate) {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            return fmt.parse(strDate);
        } catch (ParseException ex) {
            return null;
        }
    }

    /**
     * 将指定日期转换成时间戳
     * @param d
     * @param pattern
     * @return
     */
    public static int initDateStartToInt(String d, String pattern) {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat(pattern);
            Date date = fmt.parse(d);
            Date date1 = initDateStart(date);
            int cur = (int) (date1.getTime() / 1000);
            return cur;
        } catch (ParseException ex) {
            return 0;
        }
    }

    /**
     * 设置时间为当天的0点0分0秒
     * @param date
     * @return
     */
    private static Date initDateStart(Date date) {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        return c.getTime();
    }

    /**
     * 将DATE转换为
     * @param date
     * @return
     */
    public static int getCurrentTime(Date date) {
        int timeMills = 0;
        if (date == null) {
            return timeMills;
        }
        timeMills = Integer.parseInt(String.valueOf(date.getTime() / 1000));
        return timeMills;
    }

    /**
     * 将14长度的日期值进行格式化
     * 示例: 20180515123518 ==> 2018-05-15 12:35:18
     * @param bigDate
     * @return
     */
    public static String getStringDate(Long bigDate) {
        return get14StringDate(bigDate);
    }

    /**
     * 将14位长度的日期值进行格式化
     * 示例: 20180515123518 ==> 2018-05-15 12:35:18
     * @param bigDate
     * @return
     */
    public static String get14StringDate(Long bigDate) {
        if (null == bigDate) {
            return "";
        }
        String date = bigDate.toString();
        if(date.length() != 14) {
            return "";
        }
        return date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8) + " " + date.substring(8, 10) + ":" + date.substring(10, 12) + ":" + date.substring(12, 14);
    }

    /**
     * 将14位长度的日期值进行格式化
     * 示例: 20180515123518 ==> 2018-05-15
     * @param bigDate
     * @return
     */
    public static String get8StringDate(Long bigDate) {
        if(null != bigDate && bigDate > 0) {
            String date = bigDate.toString();
            if (date.length() != 14) {
                return "";
            }
            return date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
        }
        return "";
    }

    /**
     * 去除秒
     * @param date
     * @return
     */
    public static String getyyyyMMddHHmm(Long date){
        String s = date.toString();
        return s.substring(0, s.length() - 2);
    }

    /**
     * 将日期生成14位长度的日期值
     * @param date
     * @return
     */
    public static Long getLongDate(Date date) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
        return Long.valueOf(fmt.format(date));
    }

    /**
     * 将日期生成14位长度的日期值
     * @param date
     * @return
     */
    public static Long getLongDate(String date) {
        if (StringUtils.isNotBlank(date)) {
            try {
                date = date.trim();
                SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                if (date.length() == 10) {
                    fmt = new SimpleDateFormat("yyyy-MM-dd");
                }
                String str = new SimpleDateFormat("yyyyMMddHHmmss").format(fmt.parse(date));
                return Long.valueOf(str);
            } catch (ParseException ex) {
                return 0L;
            }
        } else {
            return 0L;
        }
    }

    /**
     *
     * @param date
     * @return
     */
    public static Date getDateFromLongDate(Long date){
        try{
            return new SimpleDateFormat("yyyyMMddHHmmss").parse(date.toString());
        }catch (ParseException ex){
            return null;
        }
    }

    /**
     * 日期string转14位long日期
     * @param dateStr
     * @return
     */
    public static Long getLongDateFromStr(String dateStr) {
        if (StringUtils.isBlank(dateStr)) {
            return null;
        }
        return getLongDateFromStr(dateStr, "yyyyMMddHHmmss");
    }

    /**
     * 日期string转14位long日期
     * @param dateStr
     * @param pattern
     * @return
     */
    public static Long getLongDateFromStr(String dateStr, String pattern) {
        if (StringUtils.isBlank(dateStr)) {
            return null;
        }
        SimpleDateFormat fmt = new SimpleDateFormat(pattern);
        Date date;
        try {
            date = fmt.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(pattern + "日期转换失败：" + dateStr);
        }
        return getLongDate(date);
    }

    /**
     * 日期string转14位long日期
     *
     * @param dateStr
     * @return
     */
    public static Long getTomorrow(String dateStr,int day){
        DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format2.parse(dateStr);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(Calendar.DATE, day);
            date = calendar.getTime();
            SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
            Long.valueOf(fmt.format(date));
            return Long.valueOf(fmt.format(date));
        } catch (ParseException e) {
            return 0L;
        }
    }

    /**
     * 计算两个日期之间相差多少分钟
     * @param date1 格式:20180515123518
     * @param date2 格式:20180515123518
     * @return
     */
    public static long getDiffMins(Long date1, Long date2) {
        try {
            SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date begin = dfs.parse(get14StringDate(date1));
            Date end = dfs.parse(get14StringDate(date2));
            //除以1000是为了转换成秒
            long between = (end.getTime() - begin.getTime()) / 1000;
            long min = between / 60;
            return min;
        }
        catch (ParseException ex) {
            return 0;
        }
    }

    /**
     * 根据日期格式，获取日期字符串
     * @return
     */
    public static String nowDateToString(String format){
        Date date = nowDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try{
            return dateFormat.format(date);
        }catch(Exception ex){
            ex.printStackTrace();
            return "";
        }
    }

    /**
     * 获取当前日期
     * @return
     */
    public static Date nowDate(){
        return new Date();
    }

    /**
     *  获取两个日期相差的月数
     * @param d1 较大的日期
     * @param d2 较小的日期
     * @return 如果d1>d2,返回月数差,否则返回0
     */
    public static int getMonthDiff(Date d1, Date d2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);

        if(c1.getTimeInMillis() < c2.getTimeInMillis()) {
            return 0;
        }

        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);

        // 获取年的差值 假设 d1 = 2015-8-16  d2 = 2011-9-30
        int yearInterval = year1 - year2;

        // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if(month1 <= month2 && day1 < day2) {
            yearInterval--;
        }

        // 获取月数差值
        int monthInterval = month1 + 12 - month2;
        if(day1 < day2)  {
            monthInterval --;
        }

        monthInterval %= 12;
        return yearInterval * 12 + monthInterval;
    }

    /**
     * 获取指定几天后的日期
     * @param date
     * @param day
     * @return
     */
    public static long getOtherDay(Long date,int day){
        Calendar cal=Calendar.getInstance();
        cal.setTime(DateHelper.getDateFromLongDate(date));
        cal.add(Calendar.DATE,day);
        return getLongDate(cal.getTime());
    }

    /**
     *  返回上个月第一天
     * @param d1 指定的日期
     * @return 上个月的第一天
     */
    public static Date getLastMonthFirstDay(Date d1) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d1);

        c1.add(Calendar.MONTH, -1);
        c1.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        c1.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c1.set(Calendar.MINUTE, 0);
        //将秒至0
        c1.set(Calendar.SECOND,0);
        return c1.getTime();
    }
    /**
     *  返回上个月最后一天
     * @param year 指定的年
     * @param month 指定的月
     * @return 上个月的最后一天
     */
    public static Long getLastMonthLastDay(int year,int month) {
        Calendar cal = Calendar.getInstance();
        // 设置年份
        cal.set(Calendar.YEAR, year);
        // 设置月份
        cal.set(Calendar.MONTH, month-1); //设置当前月的上一个月
        // 获取某月最大天数
        int lastDay = cal.getMinimum(Calendar.DATE); //获取月份中的最小值，即第一天
        // 设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay - 1); //上月的第一天减去1就是当月的最后一天
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return Long.parseLong(sdf.format(cal.getTime())+"000000");
    }


    /**
     *  返回上个月最后一天
     * @param d1 指定的日期
     * @return 上个月的最后一天
     */
    public static Date getLastMonthLastDay(Date d1) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d1);

        c1.set(Calendar.DAY_OF_MONTH, 1);
        c1.add(Calendar.DATE, -1);
        //将小时至23
        c1.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        c1.set(Calendar.MINUTE, 59);
        //将秒至59
        c1.set(Calendar.SECOND,59);
        return c1.getTime();
    }
    /**
     *  返回本个月第一天一天
     * @param d1 指定的日期
     * @return 上个月的最后一天
     */
    public static Long getMonthFristDay(Date d1) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d1);
        c1.set(Calendar.DAY_OF_MONTH, 1);
        c1.set(Calendar.HOUR_OF_DAY,0);
        c1.set(Calendar.MINUTE,0);
        c1.set(Calendar.SECOND,0);
        return DateHelper.getLongDate(c1.getTime());
    }
 /**
     *  返回本个月最后一天
     * @param d1 指定的日期
     * @return 上个月的最后一天
     */
    public static Long getMonthLastDay(Date d1) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d1);
        c1.set(Calendar.DAY_OF_MONTH, 1);
        c1.roll(Calendar.DAY_OF_MONTH, -1);
        //将小时至23
        c1.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        c1.set(Calendar.MINUTE, 59);
        //将秒至59
        c1.set(Calendar.SECOND,59);

        return DateHelper.getLongDate(c1.getTime());
    }

    /**
     * 获取当天0点
     * @return
     */
    public static long getToday(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        return getLongDate(cal.getTime());
    }

    /**
     * 获取昨天0点
     * @return
     */
    public static long getYestday(){
        return getOtherDay(getToday(),-1);
    }

    /**
     * 获取一个月的最后一天
     * @param year
     * @param month
     * @return
     */
    public static long getLastDayOfMonth(int year,int month){
        Calendar cal = Calendar.getInstance();
        // 设置年份
        cal.set(Calendar.YEAR, year);
        // 设置月份
        // cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.MONTH, month); //设置当前月的上一个月
        // 获取某月最大天数
        //int lastDay = cal.getActualMaximum(Calendar.DATE);
        int lastDay = cal.getMinimum(Calendar.DATE); //获取月份中的最小值，即第一天
        // 设置日历中月份的最大天数
        //cal.set(Calendar.DAY_OF_MONTH, lastDay);
        cal.set(Calendar.DAY_OF_MONTH, lastDay - 1); //上月的第一天减去1就是当月的最后一天
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return Long.parseLong(sdf.format(cal.getTime())+"000000");
    }





    /**
     * 获取一个月的最后一刻
     * @param year
     * @param month
     * @return
     */
    public static long getLastOfMonth(int year,int month){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY,23);
        cal.set(Calendar.MINUTE,59);
        cal.set(Calendar.SECOND,59);
        return getLongDate(cal.getTime());
    }

    /**
     * 获取一个月的第一天
     * @param year
     * @param month
     * @return
     */
    public static Long getFirstDayOfMonth(int year,int month){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        return getLongDate(cal.getTime());
    }

    /**
     * 获取当月的第一天
     * @return
     */
    public static Long getFirstDayOfThisMonth(){
        Long today = getToday();
        return getFirstDayOfMonth(Integer.parseInt(today.toString().substring(0,4)),Integer.parseInt(today.toString().substring(4,6)));
    }
    /**
     * 获取一年的最后一天
     * @param year
     * @return
     */
    public static long getLastDayOfYear(int year){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.DAY_OF_YEAR,cal.getActualMaximum(Calendar.DAY_OF_YEAR));
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        return getLongDate(cal.getTime());
    }

    /**
     * 获取一年的第一天
     * @param year
     * @return
     */
    public static Long getFirstDayOfYear(int year){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.DAY_OF_YEAR,1);
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        return getLongDate(cal.getTime());
    }

    public static Long getOneDayOfYear(int year){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        if (year != cal.get(Calendar.YEAR)){
            cal.set(Calendar.YEAR,year);
            cal.set(Calendar.DAY_OF_YEAR,1);
        }
        return getLongDate(cal.getTime());
    }

    /**
     * date2比date1多的天数
     * @param startDate
     * @param endDate
     * @return
     */
    public static int differentDays(Long startDate,Long endDate)
    {
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1 = dfs.parse(get14StringDate(Long.min(startDate,endDate)));
            Date date2 = dfs.parse(get14StringDate(Long.max(startDate,endDate)));
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(date1);

            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(date2);
            int day1= cal1.get(Calendar.DAY_OF_YEAR);
            int day2 = cal2.get(Calendar.DAY_OF_YEAR);

            int year1 = cal1.get(Calendar.YEAR);
            int year2 = cal2.get(Calendar.YEAR);
            //同一年
            if(year1 != year2)
            {
                int timeDistance = 0 ;
                for(int i = year1 ; i < year2 ; i ++)
                {
                    //闰年
                    if(i%4==0 && i%100!=0 || i%400==0)
                    {
                        timeDistance += 366;
                    }
                    else
                    {
                        //不是闰年
                        timeDistance += 365;
                    }
                }

                return timeDistance + (day2-day1)+1 ;
            }
            else
            {
                //不同年
                return day2-day1+1;
            }
        } catch (ParseException e) {
            return 0;
        }
    }

    /**获取两个月份之间的天数*/
    public static int getBetweenMonth(Long date1,Long date2){
        //使date1为开始日期
        if(date1>date2){
            Long temp = date1;
            date1 = date2;
            date2 = temp;
        }
        Date sDate = getDateByStrDate(date1.toString().substring(0,4)+"-"+date1.toString().substring(4,6)+"-01");

        Calendar   cal   =   Calendar.getInstance();
        int year = Integer.parseInt(date2.toString().substring(0,4));
        int month = Integer.parseInt(date2.toString().substring(4,6));
        cal.set(Calendar.YEAR,year);
        //月份-1为实际月份
        cal.set(Calendar.MONTH,month - 1);
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        Date eDate = getDateByStrDate(year+"-"+month+"-"+maxDay);
        return getIntervalDays(sDate,eDate);
    }

    public static int getIntervalDays(Date sDate, Date eDate) {
        if (null == sDate || null == eDate) {
            return -1;
        }
        long intervalMilli = eDate.getTime() - sDate.getTime();
        return (int) (intervalMilli / (24 * 60 * 60 * 1000))+1;

    }

    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DATE);
    }

    /**
     * 返回日期的月份，1-12,即yyyy-MM-dd中的MM
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH+1);
    }

    /**
     * 返回日期的年,即yyyy-MM-dd中的yyyy
     *
     * @param date
     *            Date
     * @return int
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    public static int getDaysOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
    /**获取自然月，如2018-08-29到2018-10-02算一个月*/
    public static int calDiffMonth(String startDate,String endDate){
        int result=0;
        try {
            SimpleDateFormat sfd=new SimpleDateFormat("yyyy-MM-dd");
            Date start = sfd.parse(startDate);
            Date end = sfd.parse(endDate);
            int startYear=getYear(start);
            int startMonth=getMonth(start);
            int startDay=getDay(start);
            int endYear=getYear(end);
            int endMonth=getMonth(end);
            int endDay=getDay(end);
            //1月17  大于 2月28
            if (startDay>endDay+1){
                //也满足一月
                if (endDay==getDaysOfMonth(getYear(end),2)&&endMonth==2){
                    result=(endYear-startYear)*12+endMonth-startMonth;
                }else{
                    result=(endYear-startYear)*12+endMonth-startMonth-1;
                }
            }else{
                result=(endYear-startYear)*12+endMonth-startMonth;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**获取两个月份的跨度，如2018-08-29到2018-10-02算三个月*/
    public static int getMonthsOfAge(Long startDate,Long endDate){
        if(startDate>endDate){
            Long temp = startDate;
            startDate = endDate;
            endDate = temp;
        }
        int result=0;
        int startYear = Integer.parseInt(startDate.toString().substring(0,4));
        int startMonth = Integer.parseInt(startDate.toString().substring(4,6));
        int endYear = Integer.parseInt(endDate.toString().substring(0,4));
        int endMonth = Integer.parseInt(endDate.toString().substring(4,6));
        //1月17  大于 2月28
        if (startYear<endYear){
            result=(endYear-startYear)*12+endMonth-startMonth;
        }else{
            //也满足一月
            if (startYear==endYear){
                result=endMonth - startMonth;
            }
        }
        return result+1;
    }

    /**
     * @Description: 获取指定日期下个月的第一天
     * @Param: [longDate]
     * @return: java.lang.Long
     * @Date: 2018/8/15
     */
    public static Long getNextMonth(Long longDate){
        Date date = getDateFromLongDate(longDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        calendar.add(Calendar.MONTH, 1);
        return getLongDate(calendar.getTime());
    }

    /**
     * @Description: 获取指定日期下个月的第一天
     * @Param: [longDate]
     * @return: java.lang.Long
     * @Date: 2018/8/15
     */
    public static Long getNextYear(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, 1);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return getLongDate(calendar.getTime());
    }

    public static Long gotoMonth(Long startMonth,int num){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        try{
            //初始日期
            date = sdf.parse(startMonth.toString().substring(0,6)+"01");
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        cal.setTime(date);
        cal.add(Calendar.MONTH,num);
        Long endMonth = getLongDate(cal.getTime());
        return Long.parseLong(endMonth.toString().substring(0,6)+"00000000");
    }

    /**
     * @Description: 截取年月
     * @Param: [longDate]
     * @return: java.lang.Long
     * @Date: 2018/8/15
     */
    public static Long getYearMonth(Long longDate){
        String time=longDate.toString();
        String re=time.substring(0,6);
        Long retime=Long.parseLong(re);
        return retime;
    }

    /**
     * 最大天数
     * @param date
     * @return
     */
    public static Integer getMaxDayOfMonth(Long date){
        String time = date.toString().substring(0,6);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df =  new SimpleDateFormat("yyyyMM");
        Date parsepDate = null;
        try {
            parsepDate = df.parse(time);
        } catch (ParseException e) {
            throw new RuntimeException("最大天数失败：" + date);
        }
        cal.setTime(parsepDate);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }



    public static Long getStartTime(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date zero = calendar.getTime();
        return getLongDate(zero);
    }

    /**
     * 指定月份之后的日期
     * @return
     */
    public  static Date getAfterMonth(int num){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH,num);
        return c.getTime();
    }


    public static String getDay(Long date){
        try{
            Date day = new SimpleDateFormat("yyyyMMddHHmmss").parse(date.toString());
            return new SimpleDateFormat("yyyyMMdd").format(day);
        }catch (ParseException ex){
            return null;
        }
    }
    public static Long getLastYear(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, -1);
        Date y = calendar.getTime();
        Long longDate = getLongDate(y);
        return longDate;
    }

    public static Long getFirstDayOfMonthOfYear(String date){
        String start = date.replaceAll("-", "");
        int startYear = Integer.parseInt(start.substring(0, 4));
        int startMonth = Integer.parseInt(start.substring(4, 6));
        return getFirstDayOfMonth(startYear, startMonth);
    }

    public static Long getLastDayOfMonthOfYear(String date){
        String end = date.replaceAll("-", "");
        int endYear = Integer.parseInt(end.substring(0, 4));
        int endMonth = Integer.parseInt(end.substring(4, 6));
        return getLastOfMonth(endYear, endMonth);
    }
    /**
     * 时间段按天分隔为list
     * @param startDateStr
     * @param endDateStr
     * @param dayNum
     * @param pattern
     * @return
     * @throws ParseException
     */
    public static List<Map<String,Object>> getDateList(String startDateStr, String endDateStr, int dayNum, String pattern) throws ParseException {
        if (dayNum < 1) {
            return null;
        }

        List<Map<String, Object>> dateList = new ArrayList<Map<String, Object>>();
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        Date startDate = df.parse(startDateStr);
        Date endDate = df.parse(endDateStr);
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        while (true) {
            Map<String, Object> dateMap = new HashMap<String, Object>();

            cal.add(Calendar.DATE, dayNum - 1);
            if (cal.getTime().getTime() < endDate.getTime()) {
                dateMap.put("startDate", df.format(startDate));
                dateMap.put("endDate", df.format(cal.getTime()));
                dateList.add(dateMap);
            } else {
                dateMap.put("startDate", df.format(startDate));
                dateMap.put("endDate", df.format(endDate));
                dateList.add(dateMap);
                break;
            }
            cal.add(Calendar.DATE, 1);
            startDate = cal.getTime();
        }
        return dateList;

    }
    /**
     * date2比date1多的月数,
     * @param startDate
     * @param endDate
     * @return
     */
    public static Float differentMonths(Long startDate,Long endDate)
    {
        Float result;
        Integer maxDayOfStart = getMaxDayOfMonth(startDate);
        Integer maxDayOfEnd = getMaxDayOfMonth(endDate);
        String startDateStr = startDate.toString();
        String endDateStr = endDate.toString();
        Integer differentYear = Integer.parseInt(endDateStr.substring(0,4))-Integer.parseInt(startDateStr.substring(0,4));
        result = (float) differentYear*12 + (Integer.parseInt(endDateStr.substring(4,6))-Integer.parseInt(startDateStr.substring(4,6)));
        result = result + (float)(maxDayOfStart-Integer.parseInt(startDateStr.substring(6,8)))/maxDayOfStart + (float)Integer.parseInt(endDateStr.substring(6,8))/maxDayOfEnd;
        return result;
    }

    public static  <T> List<T> removeDuplication(List<T> list){
        List<T> tmpList = new ArrayList<>();
        for(T i : list){
            if(!tmpList.contains(i)){
                tmpList.add(i);
            }
        }
        return tmpList;
    }
    /**
     * 获取当前年月
     * @param date
     * @return
     */
    public static Long getYearMonth(Date date) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMM");
        return Long.valueOf(fmt.format(date));
    }


    /**
     * 根据开始和结束时间，返回每个月的最后一天,不包括未来月份
     * @param startDate 20191201000000L
     * @param endDate 20200501000000L
     * @return
     */
    public static List<Long> getIntervalOfMonth(Long startDate,Long endDate) throws ParseException {
//        Long minDate = 20191201000000L;
//        Long maxDate = 20200501000000L;
        String minDateTime = startDate.toString().substring(0, 6);
        String maxDateTime = endDate.toString().substring(0, 6);
        Long today = DateHelper.getToday();

        ArrayList<Long> result = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");//格式化为年月
        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();
        min.setTime(sdf.parse(minDateTime));
        min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
        max.setTime(sdf.parse(maxDateTime));
        max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);
        Calendar curr = min;
        while (curr.before(max)) {
            String time = sdf.format(curr.getTime());
            String todayFmt = today.toString().substring(0, 6);
            if (time.equals(todayFmt)) {
                result.add(today);
            } else if ((new BigDecimal(todayFmt)).compareTo(new BigDecimal(time)) > 0) {
                long lastDayOfMonth = DateHelper.getLastDayOfMonth(Integer.parseInt(time.substring(0, 4)), Integer.parseInt(time.substring(4, 6)));
                result.add(lastDayOfMonth);
            } else {
//                logger.info("未来月份不同步");
                System.out.println("未来月份不同步");
            }
            curr.add(Calendar.MONTH, 1);
        }
        return result;
    }

    /**
     * Long类型日期转成yyyyMMdd000000
     * @param startDate
     * @return
     */
    public static Long getFormatDate(Long startDate) {
        if(startDate == null){
            return 0L;
        }
        return Long.parseLong(startDate.toString().substring(0,8)+"000000");
    }

    /**
     2      * 两个日期之间相差的天数
     3      * @param start
     4      * @param end
     5      * @return
     6      */
    public static  int daysBetween(Date start, Date end) {

        Calendar calst = Calendar.getInstance();
        Calendar caled = Calendar.getInstance();
        calst.setTime(start);
        caled.setTime(end);
        //设置时间为0时
        calst.set(Calendar.HOUR_OF_DAY, 0);
        calst.set(Calendar.MINUTE, 0);
        calst.set(Calendar.SECOND, 0);
        caled.set(Calendar.HOUR_OF_DAY, 0);
        caled.set(Calendar.MINUTE, 0);
        caled.set(Calendar.SECOND, 0);
        //得到两个日期相差的天数
        int days = ((int) (caled.getTime().getTime() / 1000) - (int) (calst.getTime().getTime() / 1000)) / 3600 / 24;
        return days;
    }

    /**
     * 时间加分钟
     * @param date 时间
     * @param min 分
     * @return
     */
    public static Date addMin(Date date, Integer min){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, min);
        return calendar.getTime();
    }

    public static Date addDay(Date date, Integer day){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    public static boolean isToday(Long date){
        return date.toString().substring(0, 8).equals(getLongDate(new Date()).toString().substring(0, 8));
    }

    public static Long getYYYYMMDDToLong(Date date){
        return Long.parseLong(getYearMonthDay(date) + "000000");
    }

    public static void main(String[] args) {
        System.out.println(getYYYYMMDDToLong(new Date()));
        System.out.println(getYYYYMMDDToLong(addDay(new Date(), 1))-1);
//        ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, String>> map = new ConcurrentHashMap();
//        ConcurrentHashMap<Integer, String> c = new ConcurrentHashMap<>();
//        c.put(1, "a");
//        c.put(2, "b");
//        c.put(2, "c");
//        map.put(1, c);
//        System.out.println(JSON.toJSON(map));
//
//        ConcurrentHashMap<Integer, String> integerStringConcurrentHashMap = map.get(1);
//        integerStringConcurrentHashMap.remove(1);
//        System.out.println(JSON.toJSON(map));
    }

}