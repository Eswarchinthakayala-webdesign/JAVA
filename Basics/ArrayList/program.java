package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PassingFunctions {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));

        }
    }
}

