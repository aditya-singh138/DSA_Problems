class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            min= Math.min(min,nums[mid]);
            if(nums[lo]<=nums[mid]){
                min= Math.min(min,nums[lo]);
                lo= mid+1;
            }
            else{
                min= Math.min(min,nums[lo]);
                hi=mid-1;
            }
        }
        return min;
    }
}