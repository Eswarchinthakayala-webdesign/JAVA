package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        String str="baccad";
        String ans=removeAs(str,"");
        System.out.println(ans);

     }

   static String removeAs(String up, String p) {
        if(up.isEmpty())
        {
            return p;
        }

        char ch=up.charAt(0);
        if(ch!='a')
        {
            return removeAs(up.substring(1),p+ch);
        }
        else
        {
            return removeAs(up.substring(1),p);
        }

    }

}
