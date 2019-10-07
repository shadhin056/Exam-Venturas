package com.company.distinctlist;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = {};
        System.out.println(DistinctList(arr));
    }

    public static int DistinctList(int[] arr) {

        Set<Integer> set = new HashSet<Integer>();

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        return arr.length-set.size();

    }
}
