package com.Eswar;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Fruit: ");
        String fruit=input.next();
        switch (fruit) {
            case "apple" -> System.out.println("Red in Color");
            case "orange" -> System.out.println("Orange in color");
            case "banana" -> System.out.println("Yellow in color");
            default -> System.out.println("Enter invalid Fruit name");
        }
    }
}
