class Solution {
    public int totalFruit(int[] fruits) {
        int k=2;
        HashMap<Integer,Integer>mp= new HashMap<>();
        int lo=0;
        int max=Integer.MIN_VALUE;
        for(int hi=0;hi<fruits.length;hi++){
            mp.put(fruits[hi],mp.getOrDefault(fruits[hi],0)+1);

            while(mp.size()>k){
                mp.put(fruits[lo],mp.get(fruits[lo])-1);
                if(mp.get(fruits[lo])==0) mp.remove(fruits[lo]);
                lo++;
            }
            if(mp.size()<=k){
                max= Math.max(max,hi-lo+1);
            }
        }
        return max;
    }
}