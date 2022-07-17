class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        String[] str=String.valueOf(x).split("");
        for(String j:str){     
            sum+=Integer.parseInt(j);               
        }  
       if(x%sum==0) answer=true;      
       else answer=false;    
       return answer;
    }
}