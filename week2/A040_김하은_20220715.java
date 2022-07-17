class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toUpperCase();
        String[] aString=s.split("");
        int a=0, b=0;
        for(int i=0; i<aString.length; i++){
            if(aString[i]=="a"||aString[i]=="e"||aString[i]=="i"||aString[i]=="o"||aString[i]=="u"){
                if(i<aString.length/2) a++;
                else b++;
            }
        }
        if(a==b) return true;
        else return false;
    }

}