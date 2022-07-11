import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n1, n2, n3;
        String mul;
        int[] result= new int[10];
        Scanner sc = new Scanner(System.in);
        n1= sc.nextInt();
        n2= sc.nextInt();
        n3= sc.nextInt();
        mul= Integer.toString(n1*n2*n3);
        
        for(int i=0;i<mul.length();i++){
            for(int j=0; j<10; j++){
                if(Integer.parseInt(String.valueOf(mul.charAt(i)))==j) result[j]++;
            } 
        }
   
        for(int k=0; k<10; k++){
            System.out.println(result[k]);
        }

        sc.close();    
    }
}
