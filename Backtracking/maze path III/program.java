package com.Eswar;

import java.util.ArrayList;
import java.util.List;

public class Backtrack {
    public static void main(String[] args) {

        List<String> ans=printPathII("",0,0); //(2,2) is Goal
        System.out.println(ans);


    }

    private static List<String> printPathII(String p, int r, int c) {
        List<String>ans=new ArrayList<>();
        if(r==2 && c==2)
        {

            ans.add(p);
            return ans;

        }
        if(r<2)
        {
            List<String> left=printPathII(p+"D",r+1,c);
            ans.addAll(left);
        }
        if(c<2)
        {
            List<String>right=printPathII(p+"R",r,c+1);
            ans.addAll(right);
        }
        return ans;
    }

    static void printPath(String p, int r, int c) {

      if (r == 2 && c == 2) {
          System.out.println(p);
          return;
      }
      if (c < 2) {
          printPath(p + "R", r, c + 1);
      }
      if (r < 2) {
          printPath(p + "D", r + 1, c);

      }
  }
}
