class Solution {
    public int[] searchRange(int[] arr, int x) {
        int res[]= new int[2];
        int n= arr.length;
        int lo=0;
        int hi=n-1;
        int min=-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(arr[mid]==x){
                min= mid;
                hi=mid-1;
            }
            else if(arr[mid]>x) hi=mid-1;
            else lo=mid+1;
        }
        res[0]=min;
        
        lo=0;
        hi=n-1;
        min=-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(arr[mid]==x){
                min= mid;
                lo=mid+1;
            }
            else if(arr[mid]>x) hi=mid-1;
            else lo=mid+1;
        }
        res[1]=min;
        return res;
    }
}