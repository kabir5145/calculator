package com.company;


import java.util.Calendar;

public class calendar_revision {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.clone());
    }
}
