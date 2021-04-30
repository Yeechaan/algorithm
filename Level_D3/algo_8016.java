package algo_D3;

import java.util.Scanner;

class algo_8016 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			long floor = sc.nextInt();
			long leftNum=1, rightNum=1;
			
			if(floor > 1) {
				leftNum = (floor-1)*(floor-1)*2 + 1;
				rightNum = (floor)*(floor)*2 - 1;
			}
			System.out.println("#" + i + " " + leftNum + " " + rightNum);
		}
		sc.close();
	}
}