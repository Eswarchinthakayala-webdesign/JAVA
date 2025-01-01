class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
 for(int k=0;k<4;k++) {
     int [][] ans=new int[mat.length][mat.length];
     for (int i = 0; i < mat.length; i++) {
         for (int j = 0; j < mat.length; j++) {
             ans[j][mat.length - i - 1] = mat[i][j];

         }

     }
     mat=ans;
     if(Arrays.deepEquals(target,mat))
     {
         return true;
     }

 }
 return false;
    }
}
