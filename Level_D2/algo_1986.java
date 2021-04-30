package algo0624;

import java.util.Scanner;

class algo_1986 {
	
	public static void main(String []args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int test_case;
		int number;
		
		test_case = scanner.nextInt();
		for(int i=1 ; i<=test_case ; i++) {
			int sum = 0;
			number = scanner.nextInt();
			
			for(int j=1 ; j<=number ; j++) {
				if(j%2 == 1) {
					sum+=j;
				} else {
					sum-=j;
				}
			}
			System.out.println("#" + i + " " + sum);
		}
		
	}

}
