package algo0624;

import java.util.Scanner;

public class algo_1959 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			int firNu = sc.nextInt();
			int secNu = sc.nextInt();
			int[] firNums = new int[firNu];
			int[] secNums = new int[secNu];
			
			for(int j=0 ; j<firNu ; j++) {
				firNums[j] = sc.nextInt();
			}
			for(int k=0 ; k<secNu ; k++) {
				secNums[k] = sc.nextInt();
			}
			
			int maxSum = 0;
			int sum;
			int count;
			
			if(firNu <= secNu) {
				count = secNu - firNu + 1;
				for(int j=0 ; j<count ; j++) {
					
					sum = 0;
					for(int k=0 ; k<firNu ; k++) {
						sum += firNums[k] * secNums[k+j];
					}
					if(maxSum < sum) {
						maxSum = sum;
					}
				}
			}
			else {
				count = firNu - secNu + 1;
				for(int j=0 ; j<count ; j++) {
					
					sum = 0;
					for(int k=0 ; k<secNu ; k++) {
						sum += firNums[k+j] * secNums[k];
					}
					if(maxSum < sum) {
						maxSum = sum;
					}
				}
			}
			
			System.out.println("#" + i + " " + maxSum);		
		}
	}
}
