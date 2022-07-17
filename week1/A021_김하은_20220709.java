import java.util.Scanner;

public class A021_김하은_20220709 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int num = sc.nextInt();
			sum+=num;
		}
		System.out.println(sum-(cnt-1));
		sc.close();
	}
}