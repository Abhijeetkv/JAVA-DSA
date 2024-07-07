package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(6798);
//        list.add(6987);
//        list.add(567);
//        list.add(897);
//        list.add(967);
//        list.add(587);
//
//        System.out.println(list.contains(68));
//
//        list.set(0, 799);
//
//        list.remove(5);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));   //pass index here,list[index] syntax will not work here

        }
        System.out.println(list);

    }
}
