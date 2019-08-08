package algo0624;

import java.util.Scanner;

public class algo_1946 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=1 ; i<=t ; i++) {
			String res = "";
			int n = sc.nextInt();
			String[] ci = new String[n];
			int[] ki = new int[n];
			
			for(int j=0 ; j<n ; j++) {
				ci[j] = sc.next();
				ki[j] = sc.nextInt();
				}
			
			int count = 0;
			int k = 0;
			while(k<n) {
				
				for(int j=0 ; j<ki[k] ; j++) {
					if(count == 10) {
						res = res + "\n";
						count = 0;
					}
					res = res + ci[k];
					count++;
				}
				k++;
			}
			System.out.println("#" + i + "\n" + res);
		}
		
	}

}
