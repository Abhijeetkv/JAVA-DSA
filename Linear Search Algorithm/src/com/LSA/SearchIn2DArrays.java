package com.LSA;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {

        int[][] arr = {
            {23, 4, 5},
            {32,56,78,4},
            {32,65,87,9,5},
            {34,5}
        };
        int target = 87;
        int[] ans = search(arr,target); // format of return value of {row, col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);   // -2147483648

    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int elements : ints) {
                if (elements > max) {
                    max = elements;
                }
            }
        }
        return max;
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
