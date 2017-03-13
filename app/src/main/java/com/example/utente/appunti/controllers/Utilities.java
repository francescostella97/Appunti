package com.example.utente.appunti.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utilities {
    public static String getCurrentDate(){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = df.format(c.getTime());
        return formattedDate;
    }

}
