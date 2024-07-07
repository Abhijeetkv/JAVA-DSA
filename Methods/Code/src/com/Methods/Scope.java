package com.Methods;

public class Scope {
    public static void main(String[] args) {

        // anything that is initialised outside the block can be used inside the block

        // anything that is initialised inside the block cannot be used outside the block

        // anything that is initialised outside the block cannot be reinitialised inside the block

        // anything that is initialised inside the block can be reinitialised outside the block

        int a = 109;
        int b =43;
        String name = "Abhijeet";

        {
//         int a = 70;  // already initialised outside the block in the same method, hence you cannot initialise it again but you can reassign the value
            a = 44;
            int c = 99;
            name = "Verma";
            System.out.println(name);
            // values initialised in this block will remain in block
        }
        int c = 800;
          System.out.println(name);
        System.out.println(a);

        //  System.out.println(c);  // cannot use outside the block



        //Scoping in for loops
        for (int i = 0; i < 5; i++) {
//            System.out.println(i);

            a = 324;
        }
        System.out.println(a);
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
