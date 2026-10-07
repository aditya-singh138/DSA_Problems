class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum= nums[i]+nums[j];
            if(sum==tar){
                return new int[]{i+1,j+1};
            }
            if(sum<tar) i++;
            else j--;
        }
        return new int[]{0,0};
    }
}