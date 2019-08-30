package algo_D3;

import java.util.Scanner;

public class algo_6692 {
	public static void main(String []args) throws Exception{
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int num = sc.nextInt();
			double sum=0;
			
			for(int j=0 ; j<num ; j++) {
				double prob = sc.nextDouble();
				double money = sc.nextDouble();
				
				sum = sum + (prob*money);
			}
			System.out.printf("#%d %.6f", i, sum);
		}
	}
}
