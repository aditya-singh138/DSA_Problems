class Solution {
    public int findMin(int[] nums) {
        int min= Integer.MAX_VALUE;
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(nums[lo]<=nums[mid]){
                min= Math.min(min,nums[lo]);
                lo=mid+1;
            }
            else{
                min= Math.min(min,nums[mid]);
                hi=mid-1;
            }
        }
        return min;
    }
}