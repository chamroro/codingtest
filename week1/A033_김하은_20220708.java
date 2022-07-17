import java.util.Scanner;

public class A033_김하은_20220708 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];
        int winner=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                score[i]+=sc.nextInt();
            }
            if(score[winner]<score[i]) winner = i;
        }

        System.out.printf("%d %d\n",winner+1, score[winner]);
        sc.close();
    }
}
