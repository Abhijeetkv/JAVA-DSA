package com.BSA;

public class OrderAgnosticBs {
    public static void main(String[] args) {

//        int[] arr = {2, 3, 4, 15, 16, 18, 24, 45};
        int [] arr = {45, 34, 23, 21, 20, 13, 12, 3, 1};
        int target = 3;


        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end ){
            // find the middle element
//            int mid = (start + end) / 2;   //  might be possible that (start + end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return  mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }

        }
        return  -1;

    }
}
