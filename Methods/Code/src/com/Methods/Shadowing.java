package com.Methods;

public class Shadowing {
    static  int x = 34; //this will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x);  // 34

        int x = 874;
        System.out.println(x);  // 874
        fun();
    }

    static  void fun(){
        System.out.println(x);
    }
}
