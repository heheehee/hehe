package com.homework2;

import java.time.LocalDate;

public class GiveCalendar {
    public LocalDate [] getCalender(LocalDate date){
        date=date.withDayOfMonth(1);
        int days=date.lengthOfMonth();
        LocalDate dateArrays[]=new LocalDate[days];
        for(int i=0;i<days;i++){
            dateArrays[i]=date.plusDays(i);
        }
        return dateArrays;
    }
}
