class Solution {
    public boolean searchMatrix(int[][] matrix, int tar) {
        int m= matrix.length;
        int n= matrix[0].length;
        int lo=0;
        int hi=m*n-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            int r= mid/n;
            int c= mid%n;
            if(matrix[r][c]==tar) return true;
            else if(matrix[r][c] < tar) lo=mid+1;
            else hi=mid-1;
        }
        return false;
    }
}