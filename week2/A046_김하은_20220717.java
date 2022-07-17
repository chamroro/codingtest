import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] count=new int[26];
        ArrayList<Character> player= new ArrayList<Character>();
        int rp= sc.nextInt();
        for(int i=0; i<rp; i++){
            count[(int)sc.next().charAt(0)-97]++;
        }
        int flag=0;
        for(int i=0; i<26; i++){
            if(count[i]>=5) {
                player.add((char)(i+97));
                flag=1;
            }
        }

        if(flag == 0) System.out.println("PREDAJA");
        else {
            for(Character c: player)
                System.out.print(c);
        }
        sc.close();
    }
}
