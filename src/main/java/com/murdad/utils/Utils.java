package com.murdad.utils;

public class Utils {
    public static String removeLastChar(String s) {
        if (null != s && !s.isEmpty()) {
            s = s.substring(0, s.length() - 1);
        }
        return s;
    }
}
