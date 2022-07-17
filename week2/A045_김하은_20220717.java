import java.util.*;

public class A045_김하은_20220717 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        HashMap<Character,Integer> map= new HashMap<Character,Integer>();
        for(int i=0; i<str.length(); i++ ){
            if(map.containsKey(Character.toUpperCase(str.charAt(i))))
                map.put(Character.toUpperCase(str.charAt(i)),map.get(Character.toUpperCase(str.charAt(i))).intValue()+1);
            else map.put(Character.toUpperCase(str.charAt(i)),1);
        }
   
        Character max=Character.toUpperCase(str.charAt(0));
        String multiple= "";
        for(Character item: map.keySet()){
            if(map.get(max).intValue()<map.get(item).intValue()){
                max=item; 
                multiple="";
            }else if(!max.equals(item) &&map.get(max).intValue()==map.get(item).intValue())
                multiple=max.toString()+item.toString();
        }

        if(multiple.length()!=0) System.out.println("?");
        else System.out.println(max);
        sc.close();
    }
}
