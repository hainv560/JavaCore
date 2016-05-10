package com.smartosc.demo.core.string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by smartosc on 5/10/2016.
 */
public class ConvertStringToDate {
    public static void main(String[] args) {
        String dateConvert = "22/12/2016";
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date date = dateFormat.parse(dateConvert);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
