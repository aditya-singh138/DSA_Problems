class Solution {
    public static int banana(int piles[],int mid){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+= Math.ceil((double)piles[i]/mid);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int lo=1;
        int hi=max;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            int res= banana(piles,mid);
            if(res<=h){
                min= Math.min(min,mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return min;
    }
}