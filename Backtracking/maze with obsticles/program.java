package com.Eswar;

import java.util.ArrayList;
import java.util.List;

public class Backtrack {
    public static void main(String[] args) {

     boolean[][] maze={{false,false,false},{false,true,true},{false,false,false}};
     printMazeWithObsticles("",maze,0,0);


    }

    static void printMazeWithObsticles(String p,boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(r<maze.length-1)
        {
            if(!maze[r][c])
            {
                printMazeWithObsticles(p+"D",maze,r+1,c);
            }
        }
        if(c<maze[0].length-1)
        {
            if(!maze[r][c])
            {
                printMazeWithObsticles(p+"R",maze,r,c+1);
            }
        }

    }


    static List<String> printPathII(String p, int r, int c) {
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
      if(r==c && (r<2 && c<2))
      {
          printPath(p+"Z",r+1,c+1);
      }
      if (c < 2) {
          printPath(p + "R", r, c + 1);
      }
      if (r < 2) {
          printPath(p + "D", r + 1, c);

      }
  }
}
