package com.project.api.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormat {
    public static Date getCurrentTime() {
        Date date=java.util.Calendar.getInstance().getTime();
        return date;
    }

    public static String toDateString(Date date, String format) {
        if(date==null) return null;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        return sdf.format(date);
    }

    public static Date toStringDate(String dateString, String format) {
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(format);
        try {
            Date date = dateTimeFormat.parse(dateString);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
