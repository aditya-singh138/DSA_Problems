class Solution {
    public int characterReplacement(String s, int k) {
        int lo=0;
        int max=0;
        int freq[]= new int[128];
        int maxf=0;
        for(int hi=0;hi<s.length();hi++){
            freq[s.charAt(hi)]++;
            maxf= Math.max(maxf,freq[s.charAt(hi)]);
            int len= hi-lo+1;
            while(len-maxf >k){
                freq[s.charAt(lo)]--;
                lo++;
                len=hi-lo+1;
            }
            max= Math.max(max,len);
        }
        return max;
    }
}