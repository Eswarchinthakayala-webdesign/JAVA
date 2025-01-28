package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        String up="baccadappleappleansappappleappabcdappabc";
        String ans=containAppNotApple(up,"");
        System.out.println(ans);

     }

   static String containAppNotApple(String up, String p) {
        if(up.isEmpty())
        {
            return p;
        }
        if(up.startsWith("apple"))
        {
            return containAppNotApple(up.substring(5),p);
        }
        else if(up.startsWith("app"))
        {
            return containAppNotApple(up.substring(3),p);
        }
        else
        {
            return containAppNotApple(up.substring(1),p+up.charAt(0));
        }
    }
