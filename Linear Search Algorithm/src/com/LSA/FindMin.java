package com.LSA;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2,4,-5 ,64, 4, 5,3};
        System.out.println(min(arr));
    }

//    assume arr.length != 0
//    find min no. in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
