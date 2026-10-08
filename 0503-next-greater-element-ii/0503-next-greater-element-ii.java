class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();
        int res[]= new int[nums.length + nums.length];
        int[] prr = new int[res.length];
        int[] crr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            res[nums.length+i]=nums[i];
        }
        for(int i= res.length-1;i>=0;i--){
            while(st.size()!=0 && res[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                prr[i]=-1;
            }
            else{
                prr[i]=st.peek();
            }
            st.push(res[i]);

            
        }
        for(int i=0;i<nums.length;i++){
            crr[i]=prr[i];
        }
        return crr;
       
    }
}