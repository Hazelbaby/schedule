package com.schedule.demo.controller;

import com.schedule.demo.service.GetDailyWork;
import com.schedule.demo.service.GetDateOfWeek;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class MainEntrance {

    public static void main(String[] args) {
        GetDailyWork date=new GetDailyWork();
        try {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String result=date.getDailyWork(new GetDateOfWeek().getDateOfWeek(simpleDateFormat.parse("2018-12-01")));
            System.out.println(result);
        }
        catch (ParseException e){e.printStackTrace();}
    }
}
