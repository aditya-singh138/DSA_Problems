class Solution {
    public int minSubArrayLen(int tar, int[] nums) {
        int sum=0;
        int min= Integer.MAX_VALUE;
        int lo=0;
        int hi=0;
        while(hi<nums.length){
            sum+= nums[hi];
            while(sum>=tar){
                int len= hi-lo+1;
                min= Math.min(min,len);
                sum-= nums[lo];
                lo++;
            }
            hi++;
        }
        return min==Integer.MAX_VALUE ? 0 :min;
    }
}