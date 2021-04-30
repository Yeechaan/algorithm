package algo0624;

import java.util.Scanner;

class algo_1966 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			int si = sc.nextInt();
			int[] nums = new int[si];
			
			for(int j=0 ; j<si ; j++) {
				nums[j] = sc.nextInt();
			}
			
			sortt(nums);
			
			System.out.printf("#%d ", i);
			for(int j=0 ; j<si ; j++) {
				System.out.printf("%d ", nums[j]);
			}
			System.out.printf("\n");
		}	
	}
	
	public static void sortt(int[] nn) {
		int si = nn.length;
		for(int j=0 ; j<si-1 ; j++) {
			
			for(int k = j+1 ; k<si ; k++) {
				if(nn[j] > nn[k]) {
					int temp;
					temp = nn[j];
					nn[j] = nn[k];
					nn[k] = temp;
				}
			}
		}
	}
}
