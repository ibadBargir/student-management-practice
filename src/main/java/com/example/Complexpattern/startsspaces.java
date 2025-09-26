package com.example.Complexpattern;

public class startsspaces {
    public static void main(String[] args) {
        /*
         *****
         *   *
         *   *
         *****
         */
        int  e=4;
        int y=5;

        for (int i =1; i<=e; i++){
            for (int j=1; j<=y;j++){
                if (i == 1 || j == 1 || i == e || j ==y){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
