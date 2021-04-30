package algo0624;

import java.util.Scanner;

class algo_1284 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=1 ; i<=t ; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();
			int w = sc.nextInt();
			int total_a, total_b, total_min;
			
			total_a = p*w;
			
			if(w <= r) {
				total_b = q;
			} else {
				total_b = q + (w-r)*s;
			}
			
			if(total_a < total_b) {
				total_min = total_a;
			} else {
				total_min = total_b;
			}
			
			System.out.println("#" + i + " " + total_min);
		}
	}

}
