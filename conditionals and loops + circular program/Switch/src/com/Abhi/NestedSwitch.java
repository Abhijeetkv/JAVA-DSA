package com.Abhi;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Abhijeet Verma");
            case 2 -> System.out.println("Prince Verma");
            case 3 -> {
                System.out.println("Emp  number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;

                    default:
                        System.out.println("No  Department entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
