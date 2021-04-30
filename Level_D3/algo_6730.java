package algo_D3;

import java.util.Scanner;

class algo_6730 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int number = sc.nextInt();
			int[] blocks = new int[number];
			int high=0, low=0, temp;
			
			for(int j=0 ; j<number ; j++) {
				blocks[j] = sc.nextInt();
			}
			
			for(int j=0 ; j<number-1 ; j++) {
				if(blocks[j] < blocks[j+1]) {
					temp = blocks[j+1] - blocks[j];
					if(temp > high) {
						high = temp;
					}
				} else if(blocks[j] > blocks[j+1]) {
					temp = blocks[j] - blocks[j+1];
					if(temp > low) {
						low = temp;
					}
				}
			}
			System.out.println("#" + i + " " + high + " " + low);
		}
		
	}
}
