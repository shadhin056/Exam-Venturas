package com.exam2;

import java.util.*;

public class MainTest {

    public static void main(String[] args) {

//        int[] A = {1, 3, 6, 4, 1, 2};
        int[] A = {1,2,3};

        System.out.println(solution(A));
//        System.out.println(isContain(A,5));
    }

    public static int solution(int[] A) {

        List<Integer> al = getListFromArray(A);
        for(int i=1; i<=100000+1; i++){
            if(!al.contains(i)) return i;
        }

        return 0;
    }

    private static List<Integer> getListFromArray(int[] arr) {

        List<Integer> al = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]>=1) al.add(arr[i]);
        }
        Collections.sort(al);
        return al;
    }


    public static boolean isContain(int[] arr, int n){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==n) return true;
        }

        return false;
    }
}
