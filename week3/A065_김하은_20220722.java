import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       
        int rp=sc.nextInt();
        int[][] store= new int[rp][2];
        for(int i=0; i<rp; i++){
            store[i][0]=sc.nextInt();
            store[i][1]=sc.nextInt();
        }
        Arrays.sort(store, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return Integer.compare(o1[1],o2[1]);
            } else{
                return Integer.compare(o1[0],o2[0]);
            }
        });
        
        for(int i=0; i<rp;i++){
            System.out.println(store[i][0]+" "+store[i][1]);
        }
    }
}
