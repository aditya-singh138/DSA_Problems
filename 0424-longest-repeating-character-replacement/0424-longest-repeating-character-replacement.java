class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]= new int[128];
        int lo=0;
        int maxf= Integer.MIN_VALUE;
        int max= Integer.MIN_VALUE;
        for(int hi=0;hi<s.length();hi++){
            char ch= s.charAt(hi);
            freq[ch]++;
            maxf= Math.max(maxf,freq[ch]);

            int len= hi-lo+1;
            while(len-maxf >k){
                freq[s.charAt(lo)]--;
                lo++;
                len= hi-lo+1;
            }
            max= Math.max(max,hi-lo+1);
        }
        return max;
    }
}