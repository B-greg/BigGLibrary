package com.smartsoftasia.bigglibrary.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by gregoire on 10/15/14.
 */
public class DateHelper {


    public static String dateTimeToString(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
        if(date!= null){
            return(format.format(date));
        }
        else
            return "";
    }

    public static int dateTimeID(Date date) {
        if(date!= null){
            String intMonth = (String) android.text.format.DateFormat.format("MM", date); //06
            String year = (String) android.text.format.DateFormat.format("yyyy", date); //2013
            String day = (String) android.text.format.DateFormat.format("dd", date); //20
            return Integer.valueOf(year+intMonth+day);
        }
        else
            return 0;
    }


    public static Date stringToDate(String strDate){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
        Date date= null;
        try {
            date = format.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public static String stringToHours(String strDate){

        Date dt = stringToDate(strDate);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("hh:mm aa");
        String time = dateFormatter.format(dt);
        return time;
    }

    public static String stringToDay(String strDate){

        Date dt = stringToDate(strDate);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, MMMM d");
        String time = dateFormatter.format(dt);
        return time;
    }

    public static GregorianCalendar stringToGregorianCalendar(String strDate){
        Date date;
        GregorianCalendar gregorianCalendar = null;
        try {
            date = stringToDate(strDate);
            gregorianCalendar =(GregorianCalendar) GregorianCalendar.getInstance();
            // by below we are setting the time of date into gregorianCalendar
            gregorianCalendar.setTime(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return gregorianCalendar;
    }
}
