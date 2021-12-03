package com.homework2;

import javax.swing.*;
import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarPanel extends JPanel {
    GiveCalendar calendar;
    LocalDate [] dataArrays;
    public LocalDate currentDate;
    String name[]={"日","一","二","三","四","五","六"};
    public CalendarPanel(){
        calendar=new GiveCalendar();
        currentDate=LocalDate.now();
        dataArrays=calendar.getCalender(currentDate);
        showCalendar(dataArrays);
    }
    public void showCalendar(LocalDate [] dataArrays){
        removeAll();
        GridLayout grid=new GridLayout(7,7);
        setLayout(grid);
        JLabel[] titleWeek=new JLabel[7];
        JLabel[] showDay=new JLabel[42];
        for(int i=0;i<7;i++){
            titleWeek[i]=new JLabel(name[i],JLabel.CENTER);
            add(titleWeek[i]);
        }
        for(int i=0;i<42;i++){
            showDay[i]=new JLabel("",JLabel.CENTER);
        }
        for(int k=7,i=0;k<49;k++,i++){
            add(showDay[i]);
        }
        int space=printSpace(dataArrays[0].getDayOfWeek());
        for(int i=0,j=space+i;i<dataArrays.length;i++,j++){
            showDay[j].setText(""+dataArrays[i].getDayOfMonth());
        }
        repaint();
    }
    public void setNext(){
        currentDate=currentDate.plusMonths(1);
        dataArrays= calendar.getCalender(currentDate);
        showCalendar(dataArrays);
    }

    public void setPrevious(){
        currentDate=currentDate.plusMonths(-1);
        dataArrays=calendar.getCalender(currentDate);
        showCalendar(dataArrays);
    }

    private int printSpace(DayOfWeek x) {
        int n=0;
        switch(x){
            case SUNDAY:
                n=0;
                break;
            case MONDAY:
                n=1;
                break;
            case TUESDAY:
                n=2;
                break;
            case WEDNESDAY:
                n=3;
                break;
            case THURSDAY:
                n=4;
                break;
            case FRIDAY:
                n=5;
                break;
            case SATURDAY:
                n=6;
                break;
        }
        return n;
    }
}
