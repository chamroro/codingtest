import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<10;i++){
            int input= sc.nextInt();
            input%=42;
            
            set.add(String.valueOf(input));
        }
        System.out.print(set.size());
        sc.close();
    }
}

