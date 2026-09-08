class Solution {
    public int totalFruit(int[] nums) {
        int lo=0;
        int k=2;
        int max= Integer.MIN_VALUE;
        HashMap<Integer,Integer>mp= new HashMap<>();
        for(int hi=0;hi<nums.length;hi++){
            mp.put(nums[hi],mp.getOrDefault(nums[hi],0)+1);
            if(mp.size()<=k){
                max= Math.max(max,hi-lo+1);
            }
            while(mp.size()>k){
                mp.put(nums[lo],mp.get(nums[lo])-1);
                if(mp.get(nums[lo])==0) mp.remove(nums[lo]);
                lo++;
            }
        }
        return max;
    }
}