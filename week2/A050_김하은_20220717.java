import java.util.Scanner;
public class A050_김하은_20220717 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] pw= sc.nextLine().toCharArray();
        for(char i: pw){ //A,B,C일 경우
            if((int)i<=67) System.out.print((char)((int)i+23));
            else System.out.print((char)((int)i-3));
        }
        sc.close();
    }
}
