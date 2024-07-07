package com.Methods;

public class Overloading {
    public static void main(String[] args) {

        fun(73);
        fun("Abhijeet verma");
        int ans = sum(23,44,33);
        System.out.println(ans);

        System.out.println(sum(23,32));
    }

    static  int sum(int a, int b){
        return  a+b;
    }

    static  int sum(int a, int b, int c){
        return  a+b+c;
    }


    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
