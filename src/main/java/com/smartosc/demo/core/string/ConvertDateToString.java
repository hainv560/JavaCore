package com.smartosc.demo.core.string;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by smartosc on 5/10/2016.
 */
public class ConvertDateToString {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String stringDate = dateFormat.format(date);

        System.out.println(stringDate);
    }
}
