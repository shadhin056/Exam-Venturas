package com.company.cache;


import java.util.*;

public class main {


    public static void main (String[] args) {
        // keep this function call here


        System.out.print(LRUCache(new String[] {"A", "B", "C", "D", "E", "D", "Q", "Z", "C"}));
        //System.out.print(LRUCache(new String[] {"A", "B", "A", "C", "A", "B"}));
    }

    public static String LRUCache(String[] strArr) {

        List<String> al = new ArrayList<>();
        al.add(strArr[0]);

        for(int i=0; i<strArr.length;i++){
            String s = strArr[i];
            if(al.contains(s)){
                al.remove(s);
                al.add(s);
            }else {
                al.add(s);
            }

            if(al.size()>5){
                al.remove(0);
            }
        }

        String res = "";

        for (int i = 0; i < al.size(); i++) {
            if(i==0){
                res = al.get(i);
            }else {
                res = res + "-" +al.get(i);
            }

        }

        return res;

    }


}
