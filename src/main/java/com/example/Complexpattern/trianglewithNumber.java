package com.example.Complexpattern;

public class trianglewithNumber {

    public static void main(String[] args) {
        System.out.println("____________________________");

        int x=5;

        for (int i=1; i<=x; i++){

            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
