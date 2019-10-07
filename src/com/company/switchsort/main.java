package com.company.switchsort;

public class main {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2};

        System.out.println(SwitchSort(arr));
    }

    public static int SwitchSort(int[] arr) {

        int cnt = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
        }

        return cnt;

    }

}
