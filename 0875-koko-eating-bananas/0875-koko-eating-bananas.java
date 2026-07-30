class Solution {
    public int possible(int piles[],int mid,int h){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+= Math.ceil((double)piles[i]/mid);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
            max= Math.max(max,piles[i]);
        }
        int lo=1;
        int hi= max;
        int min= Integer.MAX_VALUE;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            int res= possible(piles,mid,h);
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