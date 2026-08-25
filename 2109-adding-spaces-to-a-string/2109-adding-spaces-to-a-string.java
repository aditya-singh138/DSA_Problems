class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n= s.length();
        int m= spaces.length;
        StringBuilder sb= new StringBuilder();
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(i==spaces[j]){
                sb.append(" ");
                j++;
            }
            char ch= s.charAt(i);
            sb.append(ch);
            i++;
        }
        sb.append(s.substring(i));
        return sb.toString();
    }
}