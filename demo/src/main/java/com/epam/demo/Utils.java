package com.epam.demo;

import java.util.List;
import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try {
            return args.stream().allMatch(StringUtils::isPositiveNumber);
        }
        catch (NullPointerException exception)
        {
            return  false;
        }

    }
}