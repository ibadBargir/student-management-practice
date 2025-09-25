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
  /*      int m=4;
        int n=6;

        for (int i =1; i<=m; i++){

            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/
    /*
        *****
        *   *
        *   *
        *****

    */   /* int  e=4;
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
*/

        Set<String> name = new TreeSet<>();

        for (int i=30; i>=0; i--){
            name.add(String.valueOf(i));
            System.out.println("A"+i);
        }

    }
}
