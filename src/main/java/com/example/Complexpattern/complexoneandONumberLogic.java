package com.example.Complexpattern;

public class complexoneandONumberLogic {

    public static void main(String[] args) {
/*

        ------------------------------------------------------
                1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1
        ______________________________________

*/

        int w =5;

        for (int i =1; i<=w; i++){
            for (int j=1; j<=i; j++){
                int sum= i + j;
                if (sum % 2==0 ){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
