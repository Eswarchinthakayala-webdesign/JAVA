package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        String str="baccadappleappleans";
        String ans=containApp(str,"");
        System.out.println(ans);

     }

     static String containApp(String up,String p) {
        if(up.isEmpty())
        {
            return p;
        }
        if(up.startsWith("apple"))
        {
            return containApp(up.substring(5),p);
        }
        else
        {
            return containApp(up.substring(1),p+up.charAt(0));
        }
    }
