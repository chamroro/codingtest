class Solution {
    public static boolean backspaceCompare(String s, String t) {
         if(makeNewChar(s).equals(makeNewChar(t)))
             return true;
         else return false;  
     }
    public static String makeNewChar(String str){
        String newStr="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='#'){
                if (newStr != null && newStr.length() != 0)
                    newStr=newStr.substring(0, newStr.length() - 1);
            }else newStr+=str.charAt(i);
        }
        return newStr;
    }
}