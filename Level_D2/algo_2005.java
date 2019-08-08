package algo0624;

import java.util.Scanner;

public class algo_2005 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int num = sc.nextInt();
			int[] nums = new int[num];
			int[] numss = new int[num];
			
			System.out.println("#" + i);
			
			for(int j=0 ; j<num ; j++) {
				nums[0] = 1;
				
				if(j > 0) {
					nums[j] = 1;
				}
				
				if(j > 1) {
					for(int k=1 ; k<j ; k++) {
						nums[k] = numss[k-1] + numss[k];
					}
				}
				
				for(int k=0 ; k<j+1 ; k++) {
					System.out.printf("%d ", nums[k]);
					numss[k] = nums[k];
				}
				System.out.printf("\n");
			}
		}
	}
}
