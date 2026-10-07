class Solution {
    public int[] twoSum(int[] nums, int tar) {
        HashMap<Integer,Integer>mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(tar-nums[i]) && i!= mp.get(tar-nums[i])){
                return new int[]{mp.get(tar-nums[i]),i};
            }
        }
        return new int[]{0,0};
    }
}