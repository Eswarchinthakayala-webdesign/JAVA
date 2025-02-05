package com.Eswar;

import java.util.Arrays;

public class sudokoSolver {
    public static void main(String[] args) {
        int[][] board=
                {
                        {3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(isSolve(board))
        {
            displayBoard(board);
        }
        else
        {
            System.out.println("Can't find Answer");
        }

    }

     static boolean isSolve(int[][] board) {
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=false;
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 if(board[i][j]==0)
                 {
                     row=i;
                     col=j;
                     emptyLeft=true;
                     break;
                 }

             }
             if(emptyLeft)
             {
                 break;
             }

         }
         if(!emptyLeft)
         {
             return true;
         }
         for (int num = 1; num <=9 ; num++) {
              if(isSafe(board,row,col,num))
              {
                  board[row][col]=num;
                  if(isSolve(board))
                  {
                      return true;
                  }
                  board[row][col]=0;

              }
         }
         return false;

    }
    static boolean isSafe(int[][]board,int row,int col,int num)
    {
        //row
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==num)
            {
                return false;
            }
        }
        //column
       for(int []nums:board)
       {
           if(nums[col]==num)
           {
               return false;
           }
       }
       //sub 3x3
       int mod=(int)(Math.sqrt(board.length));
       int rowStart=row-row%mod;
       int colStart=col-col%mod;
        for (int r = rowStart; r <rowStart+mod ; r++) {
            for (int c = colStart; c <colStart+mod ; c++) {
                if(board[r][c]==num)
                {
                    return  false;
                }
            }

        }
        return  true;
    }

    static void displayBoard(int[][] board) {

        for(int[]b:board)
        {
            System.out.println(Arrays.toString(b));
        }
        System.out.println();
    }


}
