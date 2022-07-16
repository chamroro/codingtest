class Solution {
    public static String longestCommonPrefix(String[] strs) {
     String result="";
     int minLength=strs[0].length();
     for(int i=1; i<strs.length; i++){
         if(minLength>strs[i].length()) minLength=strs[i].length();
     }
     for(int j=0; j<minLength; j++){
         char prefix=strs[0].charAt(j);
         int flag=0;
         for(int k=1; k<strs.length;k++){
             if(strs[k].charAt(j)!=prefix) flag=1;
         }
         if(flag==1) break;
         else result+=prefix; 
     }
     if(result=="") System.out.println("There is no common prefix among the input strings."); 
     return result;
 }
}