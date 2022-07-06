import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		int s_num, g_num, sum, highNum;

		double avg;
		
		
		Scanner sc = new Scanner(System.in);
		s_num = sc.nextInt();
		int count=0;
		while(count<s_num){
			g_num=0;
			sum=0;
			avg=0;
			highNum=0;
			g_num=sc.nextInt();
			int[] score = new int[g_num];
			for(int i=0; i<g_num; i++){
				score[i]=sc.nextInt();
				sum+=score[i];
			}
			avg=sum/g_num;
			for(int i=0; i<g_num; i++){
				if(score[i] > avg){
					highNum++;
				}
			}
			System.out.printf("%.3f%%\n", highNum*100.0/g_num);
			
			count++;
		}
	
		sc.close();
	
	}
} 