package com.sergio;

public class LogLevels {

    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":") +1).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("["), logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine) + "(" + logLine.substring(logLine.indexOf("["), logLine.indexOf("]")).toLowerCase() + ")";
    }


}