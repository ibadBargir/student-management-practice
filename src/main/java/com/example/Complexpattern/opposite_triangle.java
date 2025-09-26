package com.example.Complexpattern;

public class opposite_triangle {

    public static void main(String[] args) {

        int u =4;

        for (int i=1;i<=u; i++){
            for (int j =1; j<=u-i ; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
