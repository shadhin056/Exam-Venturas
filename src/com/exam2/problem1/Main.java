package com.exam2.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] A = {1,4,-1,3,2};

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        int len = dig(A, 0,0);
        return len;
    }

    private static int dig(int[] a, int ind, int cnt) {

        //System.out.println("" + ind + " : " + cnt);
        if(ind>= a.length || ind<0) return cnt;

        int n = a[ind];

        if(n<a.length){
            return dig(a,n,++cnt);
        }else {
            return cnt;
        }

    }


    public static boolean isContain(int[] arr, int n){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==n) return true;
        }

        return false;
    }
}
