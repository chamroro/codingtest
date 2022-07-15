import java.util.*;

class A004 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
    
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
       
        answer = new int[list.size()];
        
	for(int i=0; i < list.size(); i++) {
		answer[i] = list.get(i);
    	}
        
    	Arrays.sort(answer);
    	if(list.size()==0){ 
    		answer = new int[1];
   	 	answer[0]= -1;
        }
        return answer;
    }
}
