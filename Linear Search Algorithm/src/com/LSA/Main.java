package com.LSA;

public class Main {
    public static void main(String[] args) {

        // Time complexicity is basically how your time grows as your input grows

        int[] nums = {23, 45, 67, 34, 56, 2, 19, 4,5 , -12, 45, 20};
        int target = 19;

        int ans = LinearSearch(nums, target);

        System.out.println(ans);
    }

    // search the target and return true or false
    static boolean LinearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            //  check for element at every index if it is = target
            if (element == target) {
                return true;

            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }


    // search the target and return the element

    static int LinearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            //  check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return element;

            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }



    // Search in the array:  return the index if item found
    // otherwise if item not found return -1
    static int LinearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            //  check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;

            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}