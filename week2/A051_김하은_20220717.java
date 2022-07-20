import java.util.*;

public class A051_김하은_22000197 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] c= sc.next().toCharArray();
        int result=0;
        HashMap<String, Integer> map= new HashMap<String, Integer>();
        map.put("ABC", 3);
        map.put("DEF", 4);
        map.put("GHI", 5);
        map.put("JKL", 6);
        map.put("MNO", 7);
        map.put("PQRS", 8);
        map.put("TUV", 9);
        map.put("WXYZ", 10);

        for(char a :c){
            for(String item: map.keySet())
                if(item.contains(Character.toString(a))){
                    result+=map.get(item).intValue();
                    break;
                }
        }
        System.out.println(result);
        sc.close();
    }
}
