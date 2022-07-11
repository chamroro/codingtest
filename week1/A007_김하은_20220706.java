import java.util.Scanner;

public class A007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scales = new int[8];
        String result;
        for(int i=0; i<8; i++){
            scales[i]= sc.nextInt();
        }
        int flag=0;
        if(scales[0]==1){
            for(int i=0; i<7; i++){
                if(scales[i]>scales[i+1]){
                    flag=1;
                    break;
                }
            }
            if(flag==0) result="ascending"; 
            else result="mixed";
        } else if (scales[0]==8){
            for(int i=0; i<7; i++){
                if(scales[i]<scales[i+1]){
                    flag=1;
                    break;
                }
            }
            if(flag==0) result="descending"; 
            else result="mixed";
        } else result="mixed";

        System.out.println(result);
        sc.close();
    }
}
