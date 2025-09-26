package com.example.Complexpattern;

public class PalindromicPattern {
    public static void main(String[] args) {

        int n =5;

        for (int i =1; i<=n; i++){
            //inner loop for space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //1st half for number
            for (int j=i; j>=1; j-- ){
                System.out.print(j);
            }
            //for 2nd half
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
