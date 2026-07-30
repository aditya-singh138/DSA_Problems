class Solution {
    public boolean searchMatrix(int[][] mat, int tar) {
        int m= mat.length;
        int n= mat[0].length;
        int lo=0;
        int hi=m*n-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            int row= mid/n;
            int col= mid%n;
            if(mat[row][col]==tar) return true;
            else if(mat[row][col]<tar) lo=mid+1;
            else hi=mid-1;
        }
        return false;
    }
}