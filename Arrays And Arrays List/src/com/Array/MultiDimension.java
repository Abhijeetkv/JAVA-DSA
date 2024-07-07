package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
         */

        //2-d arrays are defined by two brackets

        //you have to give value of rows but it is not necessary to give the value of column
        //  [] []   first is for row and 2nd is for column

        Scanner In= new Scanner(System.in);
//        int[][] arr =new int[3][];
//
//        int[][] arr = {
//                {1, 2, 3}, //0th index
//                {4, 5, }, //1st index
//                {7, 8, 9, 6} //2nd index  -> arr[2] = {7, 8, 9, 6}
//        };

        int[][] arr =new int[3][3];
        System.out.println(arr.length);  //no. of rows
        //input

        for (int row = 0; row < arr.length ; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = In.nextInt();
            }
        }

        //output
//        for (int row = 0; row < arr.length ; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //output method 2
//        for (int row = 0; row < arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//            }

        //output method 3
        //enhanced for loop

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

//        //for string
//        for (String element : str) {
//            System.out.println(element);
//        }


    }
    }

