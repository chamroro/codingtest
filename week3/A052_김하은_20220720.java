import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int rp= sc.nextInt();
        for(int i=0; i<rp; i++){
            int count=0;
            int result=0;
            String[] line= sc.next().split("");
            for(String a: line){
                if(a.equals("X")) count=0; 
                else{
                    count+=1;
                    result+=count;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}