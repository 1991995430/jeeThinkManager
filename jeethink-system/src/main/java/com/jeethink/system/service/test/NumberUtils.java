package com.jeethink.system.service.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created with IntelliJ IDEA.
 * @Author:dengbp
 * Date: 13-11-14
 * Time: 下午6:32
 */
public class NumberUtils {
    /**
     * 格式化数字
     * @param num
     * @param scale 保留几数字位小数
     * @return
     */
    public static Float format(Object num, int scale) {
        BigDecimal b = new BigDecimal(num.toString());
        return b.setScale(scale, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    public static int parseInt(Object o) {
        if (o == null) {
            return 0;
        }else if(o instanceof Integer){
           return (Integer)o;
        }
        try {
            return Integer.parseInt(o.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static Double parseDouble(Object o){
        if (o == null) {
            return 0d;
        }else if(o instanceof Double){
            return (Double)o;
        }
        try {
            return Double.parseDouble(o.toString());
        } catch (NumberFormatException e) {
            return 0d;
        }
    }

    public static Integer[] parseInts(String str){
        String[] split = str.split(",");
        Integer[] integers=new Integer[split.length];
        for(int i=0;i<split.length;i++){
            integers[i]=parseInt(split[i]);
        }
        return integers;
    }

    /**
     * 对double数据进行取精度
     * @param value double数据
     * @param scale 精度位数(保留小数位数)
     * @param roundingMode 精度取值方式。四舍五入BigDecimal.ROUND_HALF_UP
     * @return 精度计算后的数据.
     */
    public static double round(double value, int scale, int roundingMode) {
        BigDecimal decimalValue = new BigDecimal(value+"");
        decimalValue = decimalValue.setScale(scale, roundingMode);
        double dbValue = decimalValue.doubleValue();
        decimalValue = null;
        return dbValue;
    }


    /**
     * Double相加
     * @param d1
     * @param d2
     * @return Double
     */
    public static Double add(Double d1,Double d2){
        BigDecimal b1 = new BigDecimal(d1.toString());
        BigDecimal b2 = new BigDecimal(d2.toString());
        return b1.add(b2).doubleValue();
    }

    /**
     * 两个Double数相减
     * @param d1
     * @param d2
     * @return Double
     */
    public static Double sub(Double d1,Double d2){
        BigDecimal b1 = new BigDecimal(d1.toString());
        BigDecimal b2 = new BigDecimal(d2.toString());
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 两个Double数相乘
     * @param d1
     * @param d2
     * @return Double
     */
    public static Double mul(Double d1,Double d2){
        BigDecimal b1 = new BigDecimal(d1.toString());
        BigDecimal b2 = new BigDecimal(d2.toString());
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 两个Double数相除
     * @param d1
     * @param d2
     * @return Double
     */
    public static Double div(Double d1,Double d2){
        BigDecimal b1 = new BigDecimal(d1.toString());
        BigDecimal b2 = new BigDecimal(d2.toString());
        if(BigDecimal.ZERO.compareTo(b2) == 0){
            return 0d;
        }
        return b1.divide(b2,10, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 两数相除返回String,保留两位小数
     * @param d1
     * @return
     */
    public static String divConvertStr(Double d1, Double d2){
        BigDecimal b1 = new BigDecimal(d1.toString());
        BigDecimal b2 = new BigDecimal(d2.toString());
        return b1.divide(b2,2, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * BigDecimal固定取两位小数，不足补0
     * @param obj
     * @return
     */
    public static String formatToNumber(BigDecimal obj) {
        DecimalFormat df = new DecimalFormat("#.00");
        if(obj.compareTo(BigDecimal.ZERO)==0) {
            return "0.00";
        }else if(obj.compareTo(BigDecimal.ZERO)>0&&obj.compareTo(BigDecimal.ONE)<0){
            return "0"+df.format(obj).toString();
        }else {
            return df.format(obj).toString();
        }
    }

    /**
     * BigDecimal固定取四位小数，不足补0
     * @param obj
     * @return
     */
    public static String formatTo4Number(BigDecimal obj) {
        DecimalFormat df = new DecimalFormat("#.0000");
        if(obj.compareTo(BigDecimal.ZERO)==0) {
            return "0.0000";
        }else if(obj.compareTo(BigDecimal.ZERO)>0&&obj.compareTo(BigDecimal.ONE)<0){
            return "0"+df.format(obj).toString();
        }else {
            return df.format(obj).toString();
        }
    }

    /**
     * 两个BigDecimal数相除
     * @param d1
     * @param d2
     * @return
     */
    public static BigDecimal div(BigDecimal d1,BigDecimal d2,Integer scale) {
        if(scale==null){
            scale = 4;
        }
        return d1.divide(d2,scale);
    }

    public static String formatPrecisionNum(int precision,Object num) {
        if(num!=null){
            String format = String.format("%." + precision + "f", num);
            return format;
        }else{
            return precision==2?"0.00":"0.0000";
        }
    }
}
