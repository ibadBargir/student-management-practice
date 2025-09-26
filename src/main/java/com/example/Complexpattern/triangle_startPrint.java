package com.example.Complexpattern;

public class triangle_startPrint {

    public static void main(String[] args) {
        System.out.println("Print the pattern ");
        /*

         *
         **
         ***
         ****
         */

        int l=4;

        for (int i =1; i<=l;i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
