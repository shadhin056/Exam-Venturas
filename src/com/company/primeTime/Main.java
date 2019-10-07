package com.company.primeTime;

public class Main {


    public static void main(String[] args) {
        System.out.println(primeTime(0));
        System.out.println(primeTime(1));
        System.out.println(primeTime(2));
        System.out.println(primeTime(3));
        System.out.println(primeTime(4));
        System.out.println(primeTime(5));
        System.out.println(primeTime(6));
        System.out.println(primeTime(7));
        System.out.println(primeTime(8));
        System.out.println(primeTime(9));
    }

    public static String primeTime(int num) {
        if(num == 0) return "false";
        if(num == 1) return "false";
        if(num == 2) return "true";

        int mid = num / 2;
        for (int i = 2; i <= mid; i++) {
            if (num % i == 0) {
                return "false";
            }
        }
        return "true";
    }

}
