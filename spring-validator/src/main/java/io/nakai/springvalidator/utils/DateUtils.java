package io.nakai.springvalidator.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;

public class DateUtils {

    public static final String YYYYMMDDDASH = "yyyy-mm-dd";
    private static final Logger log = LoggerFactory.getLogger(DateUtils.class);

    private DateUtils() {

    }

    public static boolean isDateInValidFormat(String inputDate, String checkingFormat) {
        boolean isValidDate = false;

        try {
            SimpleDateFormat format = new SimpleDateFormat(checkingFormat);
            format.setLenient(false);
            format.parse(inputDate);
            isValidDate = true;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return isValidDate;
    }
}
