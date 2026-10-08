class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>st= new Stack<>();
        int n=temp.length;
        int res[]= new int[n];
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && temp[i]>=temp[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=0;
            }
            else{
                res[i]= st.peek()-i;
            }
            st.push(i);
        }
        return res;
    }
}