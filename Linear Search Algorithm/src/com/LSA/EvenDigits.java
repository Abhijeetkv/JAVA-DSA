package com.LSA;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {13,24,45, 23,12,88,90, 43, 40};

        System.out.println(findNumber(nums));

//        System.out.println(digits(13342));

    }


    static int findNumber(int[] nums){
        int count = 0 ;
        for (int num : nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    //  function to  check whether a number contains even digits or not
     static boolean even(int num) {

        int numberOfDigits = digits(num);
       /*
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
        */

         return numberOfDigits % 2 == 0;
    }

    // count no. of digits in a no.
    static int digits(int num){

        int count = 0;

        while (num > 0){
            count++;
            num /= 10;

        }
        return count;
    }
}
