package com.frameworkscratch;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by maheshv on 9/18/2016.
 */
public class UtilityLibrary {
    Logger log=Logger.getLogger(UtilityLibrary.class);
   /* public static void main(String args[]) {
        new Utility().generateRandomEmail();
    }*/

    public String generateRandomEmail () {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyhhmmss");
        String email=dateFormat.format(date);
        log.info("Generated email..."+email);
        return email;
    }
}


