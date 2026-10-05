class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max=-1;
        for(int i=0;i<arr.length;i++){
            max= Math.max(max,arr[i]);
        }
        int j=0;
        int c=0;
        for(int i=1;i<=max;i++){
            if(i!= arr[j]) c++;
            if(i==arr[j]) j++;
            if(c==k) return i;
        }
        return arr.length+k;
    }
}