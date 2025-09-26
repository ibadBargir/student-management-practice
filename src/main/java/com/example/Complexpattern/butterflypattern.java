package com.example.Complexpattern;

public class butterflypattern {

    public static void main(String[] args) {

        System.out.println("=================================");

/*


**      **
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *


*/


        int h =5;

        for (int i =1; i<=h;i++){

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }


            int spaces = 2 *( h-i);

            for (int j =1; j<=spaces; j++){
                System.out.print(" ");
            }

            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i =h; i>=1;i--){

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }


            int spaces = 2 *( h-i);

            for (int j =1; j<=spaces; j++){
                System.out.print(" ");
            }

            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }














    }
}
