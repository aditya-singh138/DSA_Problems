class Solution {
    public int mySqrt(int x) {
        int lo=0;
        int hi=x;
        int sqrt=1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if((long)mid*mid <=x){
                sqrt=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return sqrt;
    }
}