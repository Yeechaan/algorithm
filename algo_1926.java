package algo0624;

import java.util.Scanner;

public class algo1926 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			String nums = Integer.toString(i);

			int size = nums.length();
			int count = 0;
			
			for(int j=0 ; j<size ; j++) {
				char nu = nums.charAt(j);
				
				if(nu == '3' || nu == '6' || nu == '9') {
					count++;
				}
			}
			
			if(count == 0) {
				System.out.printf("%d ", i);
			}
			else {
				String bar = "";
				for(int k=0 ; k<count ; k++) {
					bar = bar + "-";
				}
				System.out.printf("%s ", bar);
			}
		}
	}
}