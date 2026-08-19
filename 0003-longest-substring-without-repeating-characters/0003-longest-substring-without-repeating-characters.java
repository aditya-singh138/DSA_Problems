class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lo=0;
        int max= 0;
        HashMap<Character,Integer>mp= new HashMap<>();
        for(int hi=0;hi<s.length();hi++){
            char ch= s.charAt(hi);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

            while(mp.get(ch)>1){
                char r= s.charAt(lo);
                mp.put(r,mp.get(r)-1);
                lo++;
            }
            max= Math.max(max,hi-lo+1);
        }
        return max;
    }
}