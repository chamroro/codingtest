import java.util.HashMap;
import java.util.Map;


class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            int putNum=1;
            if(map.containsKey(num)){
                putNum= map.get(num)+1;
            }
            map.put(num, putNum);
        }
        int result=0;
        for(int item: map.keySet()){
            if(map.get(item)%2==1)
                result=item;
        }
        return result;
    }
}



