package com.twosum;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7};



        System.out.println(TwoSum(arr));


    }


    public static String TwoSum(int[] arr) {

        String s = "";
        int tar = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int a = arr[i];
            for (int j = i+1; j < arr.length; j++) {

                if(a+ arr[j] ==tar){

                    s = s + (a + ","+arr[j]) + " ";
                }



            }
        }



        return s.trim();
    }

}
