package com.Eswar;

public class Backtrack {
    public static void main(String[] args) {

        printPath("",0,0); //(2,2) is Goal


    }

  static void printPath(String p, int r, int c) {

        if(r==2 && c==2)
        {
            System.out.println(p);
            return;
        }
        if(r==2)
        {
            printPath(p+"R",r,c+1);
        }
        else if(c==2)
        {
            printPath(p+"D",r+1,c);

        }
        else {
            printPath(p + "D", r + 1, c);
            printPath(p + "R", r, c + 1);
        }
    }
}
