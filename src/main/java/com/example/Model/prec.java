package com.example.Model;

import java.util.Set;
import java.util.TreeSet;

public class prec {

    public static void main(String[] args) {
        /*
        ******
        ******
        ******
        ******
*/
        /*
        ******
        *    *
        *    *
        ******
        */
        int m=4;
        int n=6;

        for (int i =1; i<=m; i++){

            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
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

        Set<String> name = new TreeSet<>();

        for (int i=30; i>=0; i--){
            name.add(String.valueOf(i));
            System.out.println("A"+i);
        }

        System.out.println("__________________________________________________________________________");

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

        System.out.println("-------------------------------------------");
        int t=4;
        for (int i=t; i>=1; i-- ){
            for (int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");


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


        System.out.println("____________________________");

        int x=5;

        for (int i=1; i<=x; i++){

            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("________________________________________________________");

        int a =5;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=a-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("__________________________________");
/*

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

*/

        int o =5;
        int number=1;

        for (int i=1; i<=o; i++){
            for (int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++; //number = number + 1
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------");

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

        System.out.println("______________________________________");


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
