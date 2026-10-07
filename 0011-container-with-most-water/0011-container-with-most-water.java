class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j= height.length-1;
        int max=0;
        while(i<j){
            int ht= Math.min(height[i],height[j]);
            int wt= j-i;
            int area= ht*wt;
            max= Math.max(max,area);

            if(height[i]<height[j]) i++;
            else j--;
        }
        return max;
    }
}