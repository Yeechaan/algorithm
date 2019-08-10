package algo_D3;

import java.util.Scanner;

public class algo_1963 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ans, ansCount, maxCount=0;
			int[] ansRight = new int[n];
			
			//사람 수 만큼 반복한다.
			for(int j=0 ; j<n ; j++) {
				ansCount = 0;
				//문제 수 만큼 반복한다.
				for(int k=0 ; k<m ; k++) {
					ans = sc.nextInt();
					if(ans == 1) {
						ansCount++;
					}
				}
				ansRight[j] = ansCount;
				if(ansCount > maxCount) {
					maxCount = ansCount;
				}
			}
			
			int numRight = 0;
			for(int j=0 ; j<n ; j++) {
				if(ansRight[j] == maxCount) {
					numRight++;
				}
			}
			
			System.out.println("#" + i + " " + numRight + " " + maxCount);
		}
		sc.close();
	}
}
