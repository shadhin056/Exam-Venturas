package com.exam2.problem2;

public class Main {

    public static void main(String[] args) {


        String S = "";
        int N=4;

        System.out.println(solution(N,S));
    }


    public static int solution(int N, String S) {
        // write your code in Java SE 8


        String[] arrR = S.split(" ");

        int cnt = 0;

        for (int i= 1; i<=N; i++){
            int n = getRowRes(arrR, i);
            cnt = cnt + n;
        }

        return cnt;
    }

    private static int getRowRes(String[] arrR, int row) {

        if(isAvailableL(arrR,row) && isAvailableMF(arrR,row) && isAvailableR(arrR,row)) return 2;

        if(isAvailableMF(arrR,row) && (isAvailableL(arrR,row) ||isAvailableR(arrR,row))) return 1;

        if(isAvailableML(arrR,row) && isAvailableL(arrR,row)) return 1;
        if(isAvailableMR(arrR,row) && isAvailableR(arrR,row)) return 1;

        if(isAvailableMF(arrR,row)) return 1;

        return 0;
    }

    private static boolean isAvailableL(String[] arrR, int row) {

        if(isContain(arrR,row+"B") || isContain(arrR,row+"C")) return false;
        return true;

    }

    private static boolean isAvailableR(String[] arrR, int row) {

        if(isContain(arrR,row+"H") || isContain(arrR,row+"J")) return false;
        return true;

    }


    private static boolean isAvailableML(String[] arrR, int row) {

        if(isContain(arrR,row+"D") || isContain(arrR,row+"E")) return false;
        return true;

    }



    private static boolean isAvailableMR(String[] arrR, int row) {

        if(isContain(arrR,row+"F") || isContain(arrR,row+"G")) return false;
        return true;

    }


    private static boolean isAvailableMF(String[] arrR, int row) {

        if(isAvailableML(arrR, row) && isAvailableMR(arrR,row))return  true;

        return false;

    }





    public static boolean isContain(String[] arr, String s){

        for(int i=0; i<arr.length; i++){
            if(arr[i].equalsIgnoreCase(s)) return true;
        }

        return false;
    }
}
