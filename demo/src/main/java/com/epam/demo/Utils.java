package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String elem : args)
        {
            if( Integer.valueOf(elem) < 0 )
            {
                return false;
            }

        }
        return  true;
    }
}