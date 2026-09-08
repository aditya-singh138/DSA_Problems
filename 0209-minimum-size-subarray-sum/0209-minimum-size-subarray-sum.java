class Solution {
    public int minSubArrayLen(int tar, int[] nums) {
        int lo=0;
        int sum=0;
        int min= Integer.MAX_VALUE;
        for(int hi=0;hi<nums.length;hi++){
            sum+= nums[hi];
            while(sum>=tar){
                min= Math.min(min,hi-lo+1);
                sum-=nums[lo];
                lo++;
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}