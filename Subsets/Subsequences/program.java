package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        String up="abc";
        subsetsPrac(up,"");

     }

     static void subsetsPrac(String up, String p) {

        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        subsetsPrac(up.substring(1),p+ch);
        subsetsPrac(up.substring(1),p);
    }
