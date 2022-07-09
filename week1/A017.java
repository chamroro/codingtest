import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int six=0;
        int nine=0;
        int[] store= new int[10];
        int result=0;
        for(int i=0; i<input.length(); i++){
            for(int j=0; j<10; j++){
                if(Integer.parseInt(String.valueOf(input.charAt(i)))==j){
                    if(j==6) six++;
                    else if(j==9) nine++;
                    store[j]++;
                }
            }
        }

        for(int i=0; i<10; i++){
            if(store[i]>store[result]) result=i;
            else if(store[i]==store[result] && i!=6 && i!=9)
                result=i;
        }

        if(result!=6 && result!=9) System.out.println(store[result]);
        else if((six+nine)%2==0) System.out.println((six+nine)/2);
        else System.out.println((six+nine)/2+1);
  
        sc.close();

    }
}
