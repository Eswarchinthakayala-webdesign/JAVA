package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        String str="baccad";
        String ans=removeAsII(str);
        System.out.println(ans);

     }

    static String removeAsII(String up) {
        if(up.isEmpty())
        {
            return "";
        }
        char ch=up.charAt(0);
        if(ch!='a')
        {
            return ch+removeAsII(up.substring(1));
        }
        else
        {
            return removeAsII(up.substring(1));
        }
    }
