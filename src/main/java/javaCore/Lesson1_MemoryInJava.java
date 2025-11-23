package javaCore;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson1_MemoryInJava {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);

        Integer value2 = 33;
        changeValue(value2);
        System.out.println(value2);

        Integer[] valueArray = new Integer[]{3, 4};
        changeValue(valueArray);
        System.out.println(Arrays.toString(valueArray));

        Integer[] valueArray2 = new Integer[]{3, 4};
        changeValueArray(valueArray2);
        System.out.println(Arrays.toString(valueArray2));
    }

    public static void changeValue(int value) {
        value = 22;
    }

    public static void changeValue(Integer value) {
        value = 22;
    }

    public static void changeValue(Integer[] valueArray) {
        valueArray = new Integer[]{1, 2};
    }

    public static void changeValueArray(Integer[] valueArray) {
        valueArray [0] = 99;
    }
}
