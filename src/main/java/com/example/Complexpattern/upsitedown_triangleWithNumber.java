package com.example.Complexpattern;

public class upsitedown_triangleWithNumber {
    public static void main(String[] args) {
        int a =5;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=a-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
