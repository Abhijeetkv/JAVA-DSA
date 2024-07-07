package com.basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        // typecasting-compressing the bigger no.  in smaller type explicitly
   //     int num = (int)(78.485f);
    //    System.out.println(num);

        // automatic type promotion in expression

//        int a =257;
//        byte b = (byte) (a); //256 % 256 =1
 //       System.out.println(b);

//        byte a =40;
//        byte b =50;
//        byte c =100;
//        int d = (a * b) / c;
//        System.out.println(d);

  //      int number = 'A';
  //      System.out.println(number);

        //java unicode value eg
//        System.out.println("नमस्ते");
//        System.out.println("привет");
//        System.out.println("你好");
//        System.out.println("こんにちは");

    //    System.out.println(3 * 5.64);
     //   System.out.println( 3 * 4);

        byte b =42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f =5.67f;
        double d =0.1234;
        double result = (f * b) + (i / c) - (d*s);
        // float + int - double =double

        System.out.println((f * b) + " " + (i / c) +" " +(d*s));
        System.out.println(result);


    }
}
