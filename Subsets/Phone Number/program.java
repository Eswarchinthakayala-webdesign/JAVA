package com.Eswar;
import java.util.*;

public class LeetCode {

    public static void main(String[] args) {
    String up="";
    phoneNum(up,"");

    }

    static void phoneNum(String up, String p) {

        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        int start=(ch-'0'-1)*3;
        int end=(ch-'0')*3;
        for (int i = start; i < end; i++) {
            phoneNum(up.substring(1),p+(char)(i+'a'));
        }
    }


}
