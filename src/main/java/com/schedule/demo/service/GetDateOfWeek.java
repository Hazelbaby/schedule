package com.schedule.demo.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.Date;


@Service
public class GetDateOfWeek {

    //private Date startDate;

    public String getDateOfWeek(Date startDate){
        String[] weekDays={"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Saturday"};
        Calendar cal=Calendar.getInstance();
        cal.setTime(startDate);
        int x=cal.get(Calendar.DAY_OF_WEEK)-1;
        if (x<0){x=0;}
        return weekDays[x];
        }

}
