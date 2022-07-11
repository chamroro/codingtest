import java.util.Scanner;

public class A015 {
    public static void main(String[] args){
        int theNumber=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            theNumber+= Math.pow(sc.nextInt(),2);
        }
        theNumber = theNumber %10;
        sc.close();
        System.out.print(theNumber);

    }
}
