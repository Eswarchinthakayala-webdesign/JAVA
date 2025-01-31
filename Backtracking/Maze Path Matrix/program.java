package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtrack {
    public static void main(String[] args) {
     int[][] path=new int[3][3];
     boolean[][] maze=new boolean[3][3];
     AllPaths("",maze,0,0,0,path);


    }

   static void AllPaths(String p, boolean[][] maze, int r, int c,int step,int[][]path) {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            path[r][c]=step+1;
            System.out.println(Arrays.deepToString(path));
            System.out.println(p);
            return;
        }

        if(maze[r][c])
        {

            return;
        }
        maze[r][c]=true;
        step=step+1;
        path[r][c]=step;
        if(r<maze.length-1)
        {

            AllPaths(p+'D',maze,r+1,c,step,path);

        }
        if(c<maze[0].length-1)
        {

            AllPaths(p+'R',maze,r,c+1,step,path);

        }
        if(r>0)
        {

            AllPaths(p+'U',maze,r-1,c,step,path);

        }
        if(c>0)
        {

            AllPaths(p+'L',maze,r,c-1,step,path);

        }

        maze[r][c]=false;
        step=0;
        path[r][c]=step;

    }
