package com.Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        //  variable length arguments  - ...v

    fun(2,3,4,54,5,5,6,55,4);

    multiple(2,4, "abhijeet" , " Verma");

    demo(3,3,4,44,5,556,66,66,6);

    demo("abhi", "vishu", "ayush");
    }

    static  void  demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static  void  demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


    static void multiple(int a, int b, String ...v){
        System.out.println();
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
