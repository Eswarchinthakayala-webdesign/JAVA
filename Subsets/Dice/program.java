package com.Eswar;
import java.util.*;

public class LeetCode {

    public static void main(String[] args) {

        diceFace(4,"");


    }

 static void diceFace(int target, String p) {

        if(target==0)
        {
            System.out.println(p);
            return;
        }

     for (int i = 1; i <=6 && i<=target ; i++) {
         diceFace(target-i,p+i);
     }
    }
