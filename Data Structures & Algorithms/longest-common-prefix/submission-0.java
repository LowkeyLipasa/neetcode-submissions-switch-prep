class Solution {
    public String longestCommonPrefix(String[] strs) {
        //by brute force
        int n=strs.length;
        int min_length=strs[0].length();
        int index=0;
        for(int i=1;i<n;i++){
            if(strs[i].length()<min_length){
                min_length=strs[i].length();
                index=i;
            }
        }

        StringBuilder sb=new StringBuilder(strs[index]);
        for(int i=0;i<n;i++){
            for(int j=0;j<sb.length();j++){
                if(strs[i].charAt(j)!=sb.charAt(j)){
                    sb.delete(j,sb.length());
                    break;
                }

                else if(sb.length()==0)
                    return "";
            }
        }

        return sb.toString();
    }
}