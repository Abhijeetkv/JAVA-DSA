package com.Array;

public class Main {
    public static void main(String[] args) {

//        syntax
//        datatype[] variable_name = new datatype[size];

        // store 5 roll numbers

//        int[] rnos = new int[5];
        //or directly

//        int[] rnos2 = {2, 5, 6, 7, 9};

        int[] ros;  // declaration of array.  ros is defined in stack
        ros = new int[5];  // actually here object is being created in the memory (heap)

        System.out.println(ros[1]);

        String[] arr = new String[5];
        System.out.println(arr[0]);
    }
}