package com.Array;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
      static void change(int[] arr)  {

        arr[0] = 99;
      }

      //strings are inmutable in java
    //but arrays are mutable in java
    //mutable means you can change the object
}
