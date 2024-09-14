package com.Eswar;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Nested Switch Cases
        System.out.print("Enter the Emp ID: ");
        int empID=input.nextInt();
        System.out.print("Enter the Department: ");
        String department=input.next();
        switch(empID)
        {
            case 1:
                System.out.println("Eswar");
                break;
            case 2:
                System.out.println("Sriram");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch(department)
                {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");
                }
            default:
                System.out.println("Enter correct Employee ID");
        }

    }
}
