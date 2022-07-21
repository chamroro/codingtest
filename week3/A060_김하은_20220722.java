import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        String[] ops= {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] ops) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        for(int i=0; i<ops.length; i++){
            switch(ops[i]){
                case "C": 
                    result.remove(result.size()-1);
                    break;
                case "D":
                    result.add(Integer.valueOf(result.get(result.size()-1)*2));
                    break;
                case "+":
                    result.add(Integer.valueOf(result.get(result.size()-1)+result.get(result.size()-2)));
                    break;
                default:
                    result.add(Integer.parseInt(ops[i]));
            }
        }
        int r=0;
        for(int j:result){
            r+=j;
        }

        return r;  
    }
}
