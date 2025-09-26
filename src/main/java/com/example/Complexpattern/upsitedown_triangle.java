package com.example.Complexpattern;

public class upsitedown_triangle {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        int t=4;
        for (int i=t; i>=1; i-- ){
            for (int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
