package com.company;

public class MathUtil {
    private static int i;
    private static int factorial;
    private static int geometric;
    private static int arithmetic;


    public static void factorial() {
        i = 1;
        factorial = 4;
        factorial = i * (i + i) * (i + i + i) * (i + i + i + i);
        System.out.println(factorial);

    }

    public static void geometric() {
        i = 1;
        geometric = 4;
        geometric = i * geometric * geometric * geometric * geometric;
        System.out.println(geometric);

    }

    public static void arithmetic() {
        i = 1;
        arithmetic = 4;
        arithmetic = i + arithmetic + arithmetic + arithmetic + arithmetic;
        System.out.println(arithmetic);
    }
}
