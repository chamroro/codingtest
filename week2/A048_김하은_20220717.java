import java.util.Scanner;

public class A048_김하은_20220717 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rp= sc.nextInt();
        int count=0;
        for(int i=0; i<rp; i++){
            int flag=0;
            String[] abc= sc.next().split("");
            for(int j=0; j<abc.length; j++){
                for(int k=0; k<j; k++){
                    if(abc[j].equals(abc[k])&&!abc[j].equals(abc[j-1])){
                        count++;
                        flag=1;
                        break;
                    }
                }
                if(flag==1) break;
            }
        }
        System.out.println(rp-count);
        sc.close();
    }
}