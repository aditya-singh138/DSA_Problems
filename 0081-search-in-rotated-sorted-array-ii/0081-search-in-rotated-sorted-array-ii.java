class Solution {
    public boolean search(int[] nums, int tar) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(nums[mid]==tar) return true;
            if(nums[lo]==nums[mid] && nums[mid]==nums[hi]){
                lo=lo+1;
                hi=hi-1;
            }
            else if(nums[lo]<=nums[mid]){
                if(nums[lo]<=tar && tar<=nums[mid]) hi=mid-1;
                else lo=mid+1;
            }
            else{
                if(nums[mid]<=tar && tar<=nums[hi]) lo=mid+1;
                else hi=mid-1;
            }
        }
        return false;
    }
}