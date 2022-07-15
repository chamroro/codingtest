import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int count= sc.nextInt();
        int[] num1 = new int[count];
        Integer[] num2 = new Integer[count];
        int result=0;
        
        for(int i=0; i<count;i++){
            num1[i]= sc.nextInt();
        }
        for(int i=0; i<count;i++){
            num2[i]= sc.nextInt();
        }
        Arrays.sort(num1);
        Arrays.sort(num2, Comparator.reverseOrder());

        for(int i=0; i<count;i++){
            result+= num1[i]*num2[i];
        }
        sc.close();
        System.out.println(result);
    }
}