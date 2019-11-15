package com.heiden.study;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String formatTosepara(float data) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(data);
    }

    public static String formattoSepa(String test1){
        int douhao = test1.indexOf('.');
        StringBuffer sb =new StringBuffer(test1);
        int pos = douhao - 3;
        if(douhao <  sb.length() - 3){
            sb.delete(douhao + 3,sb.length());
        }

        while(pos > 0){
            sb.insert(pos,',');
            pos -= 3;
        }
        return sb.toString();
    }

    public static String str2date(String date1){
        SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy年MM月dd日");
        String ret = "1970-01-01";
        try {
            Date d1 = sdf.parse(date1);
            ret = sdf2.format(d1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ret;
    }

    public static void main( String[] args )
    {

        String rate = "HKD:1.0001,USD:7.00002,EUR:8.0003";
        System.out.println("test:"+ formatTosepara(12345678912.003f));
        System.out.println("test: data "+ str2date("20191018"));

        System.out.println("test----" + formattoSepa("12345678912.003456"));;
        System.out.println("test----" + formattoSepa("12345678912.12"));;
        String str1 = "-3000215000";
        String str = "abcde";
        System.out.println(str.substring(0,5));
        BigDecimal bd1 = new BigDecimal(str1);
        float f3 = Float.parseFloat(bd1.toPlainString());
        double d1 = Double.parseDouble(str1);
        float f2 = Float.parseFloat(str1);
        float f1 = (float)d1;
        NumberFormat format;
        format = NumberFormat.getNumberInstance();
        format.setGroupingUsed(false);
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMaximumFractionDigits(4);

        float v1 = Float.parseFloat(format.format(bd1));
        System.out.printf("%f,%f,%f,%f,%f,%f",f1,d1,bd1.floatValue(),bd1.doubleValue(),f3,v1);


        System.out.println( "Hello World!" );
    }
}
