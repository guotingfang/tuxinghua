package com.springboot.jxsc.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class IdGenerateUtil {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final String chars= "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final int count = 5;

    public static String getRandomNuber(){
        return RandomStringUtils.random(count,chars);
    }
    /**
     *
     * @return
     */
    public static String timestamp() {
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(formatter);
        return format + getRandomNuber();
    }

}
