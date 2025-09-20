package com.example.Controller;

public class mains {

    public static void main(String[] args) {
       int a= 10;  int b =20;

       /*b= b-a;
       a = a +b;*/

        int c;

        c = a+b;

        a = c;

        b = a- b;

        a = a-b;


        System.out.println("A = " + a + " " +"B=" + b);
    }
}
