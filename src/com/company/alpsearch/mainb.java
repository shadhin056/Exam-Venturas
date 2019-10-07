package com.company.alpsearch;


public class mainb {


    public static void main (String[] args) {
        // keep this function call here



        System.out.println(AlphabetSearching("abcdefghijklmnopqrstuvwxyyyy"));
        System.out.println(AlphabetSearching("abcdefghijklmnopqrstuvwxyz"));
    }


    public static String AlphabetSearching(String str) {

        boolean b = true;

        for (int i = 97; i <=122 ; i++) {

            Character ch = (char) i;

            if(!str.contains(ch.toString())){
                b=false;
                break;
            }

        }

        if(b) return "true";
        else  return "false";

    }





}
