import java.util.*;

public class A110_김하은_20220707 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        int money=1000-input;
        int result=0;
        int count=0;
        if(money>=500){
            count=money/500;
            result+= count;
            money-=count*500;
        }
        if(money>=100){
            count=money/100;
            result+= count;
            money-=count*100;
        }
        if(money>=50){
            count=money/50;
            result+= count;
            money-=count*50;
        }
        if(money>=10){
            count=money/10;
            result+= count;
            money-=count*10;
        }
        if(money>=5){
            count=money/5;
            result+= count;
            money-=count*5;
        }
        if(money>=1){
            result+= money;
        }
        sc.close();
        System.out.println(result);

    }

 
}
