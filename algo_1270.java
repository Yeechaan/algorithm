package algo0624;

import java.util.Arrays;
import java.util.Scanner;

public class algo_1270 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		
		for(int i=1 ; i<=test ; i++) {
			int num = sc.nextInt();
			int count = 0;
			int nu, k;
			int[][] nums = new int[101][2];
						
			for(int j=0 ; j<1000 ; j++) {
				nu = sc.nextInt();
				k = 0;
				int en = 0;
				while(k<=count) {
					if(nu == nums[k][0]) {
						nums[k][1] +=1;
						en = 1;
						//System.out.println("기존" + nums[k][0] + " " + nums[k][1]);
						//k = count;
					}
					k++;
				}
				if(en == 0) {
					nums[count][0] = nu;
					nums[count][1] = 1;
					//System.out.println("추가"+nums[count][0] + " " + nums[count][1]);
					count++;
					
				}
				
			}
			int index = 0;
			int max = nums[index][1];
			for(int j=1 ; j<100 ; j++) {
				
				if(nums[j][1] == max) {
					if(nums[index][0] < nums[j][0]) {
						index = j;
					}
				}
				
				if(nums[j][1] > max) {
					max = nums[j][1];
					index = j;
				}
			}
			
			System.out.println("#" + i + " " + nums[index][0]);
		}
		
		sc.close();
	}
}
