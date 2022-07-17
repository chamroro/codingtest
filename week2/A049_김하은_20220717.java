import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] mo= {"a", "e", "i", "o", "u"};
        while(true){
            String pw= sc.nextLine();
            if(pw.equals("end")) break;
            int mocount=0;
            int jacount=0;
            int result=0; 
            //첫번째 조건
            if(!pw.contains("a")&&!pw.contains("e")&&!pw.contains("i")&&!pw.contains("o")&&!pw.contains("u"))
                result=1;
            String[] pwchar= pw.split("");
            //두번째 조건
            for(int i=0; i<pw.length(); i++){
                if(Arrays.asList(mo).contains(pwchar[i])) {
                    mocount++;
                    jacount=0;}
                else {
                    mocount=0;
                    jacount++;
                }
                if(mocount==3 || jacount==3 ) {
                    result=1;
                    break;
                }
                //세번째 조건
                if(i!=0){
                    if(pwchar[i].equals(pwchar[i-1])&&!pwchar[i].equals("o")&&!pwchar[i].equals("e")){
                        result=1; break;
                    } 
                }
            }
            if(result==0) System.out.println("<"+pw+">"+" is acceptable.");
            else System.out.println("<"+pw+">"+" is not acceptable.");
        }
        sc.close();

    }
}
