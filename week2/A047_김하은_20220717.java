import java.util.Scanner;

public class A047_김하은_20220717 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] abc= sc.nextLine().split("");
        for(int i=0; i< abc.length; i++){
            if(i!=0&&i%10==0) System.out.print("\n");
            System.out.print(abc[i]);
        }
        System.out.print("\n");
        sc.close();
    }
}
