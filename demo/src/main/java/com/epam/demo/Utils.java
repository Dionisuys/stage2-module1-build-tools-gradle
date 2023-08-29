package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        if (args == null || args.isEmpty()) {
            return false;
        }

        for (String arg : args) {
            try {
                double value = Double.parseDouble(arg);
                if (value <= 0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;

    }
}