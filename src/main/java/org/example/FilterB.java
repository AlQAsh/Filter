package org.example;

import java.util.Arrays;


public class FilterB {

    public static Object[] filter(Object[] array, FilterA filter) {
        return Arrays.stream(array).map(filter::apply)
                .toArray();
    }
}
