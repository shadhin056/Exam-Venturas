package com.company.fizzbuzz;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num = sc.nextInt();
        System.out.println(FizzBuzz(num));
    }


    public static String FizzBuzz(int num) {

        String res="";

        for(int i=1;i<=num;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                res=res+" "+"FizzBuzz";
            }
            else if(i%3==0)
            {
                res=res+" "+"Fizz";
            }
            else if(i%5==0)
            {
                res=res+" "+"Buzz";
            }
            else{
                res=res+" "+i;
            }

        }

        return res.trim();

    }


}
