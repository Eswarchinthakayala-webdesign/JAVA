package com.Eswar;

import java.util.ArrayList;
import java.util.List;

public class Backtrack {
    public static void main(String[] args) {

     boolean[][] maze=new boolean[3][3];
     AllPaths("",maze,0,0);


    }

   static void AllPaths(String p, boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }

        if(maze[r][c])
        {

            return;
        }
        if(r<maze.length-1)
        {
            maze[r][c]=true;
            AllPaths(p+'D',maze,r+1,c);
            maze[r][c]=false;
        }
        if(c<maze[0].length-1)
        {
            maze[r][c]=true;
            AllPaths(p+'R',maze,r,c+1);
            maze[r][c]=false;
        }
        if(r>0)
        {
            maze[r][c]=true;
            AllPaths(p+'U',maze,r-1,c);
            maze[r][c]=false;
        }
        if(c>0)
        {
            maze[r][c]=true;
            AllPaths(p+'L',maze,r,c-1);
            maze[r][c]=false;
        }

    }
