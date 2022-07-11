import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
       
        String[] c= input.split("");
        String[] suffix=new String[input.length()];
        int count=0;
        for(int i=0; i<input.length(); i++){
            suffix[i]="";
            count=i;
            while(count<input.length()){
                suffix[i]+=c[count];
                count++;
            }
        }
        Arrays.sort(suffix);
        for(int i=0; i<c.length; i++){
            System.out.println(suffix[i]);
        }
        
        sc.close();
    }
}