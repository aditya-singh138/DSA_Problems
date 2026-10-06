class Solution {
    public int longestOnes(int[] nums, int k) {
        int lo=0;
        int freq[]= new int[2];
        int max=0;
        for(int hi=0;hi<nums.length;hi++){
            freq[nums[hi]]++;
            while(freq[0] > k){
                freq[nums[lo]]--;
                lo++;
            }
            max= Math.max(max,hi-lo+1);
        }
        return max;
    }
}