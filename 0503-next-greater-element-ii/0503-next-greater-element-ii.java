class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st= new Stack<>();
        int n=nums.length;
        int res[]= new int[2*n];
        int prr[]= new int[2*n];
        int curr[]= new int[n];
        for(int i=0;i<n;i++){
            res[i]= nums[i];
            res[n+i]= nums[i];
        }
        for(int i=res.length-1;i>=0;i--){
            while(st.size()>0 && res[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0) prr[i]=-1;
            else prr[i]= st.peek();
            st.push(res[i]);
        }
        for(int i=0;i<n;i++){
            curr[i]= prr[i];
        }
        return curr;
    }
}