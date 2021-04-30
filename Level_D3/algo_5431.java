package algo_D3;

import java.util.Scanner;

class algo_5431 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int student = sc.nextInt();
			int rep = sc.nextInt();
			int[] reps = new int[rep];
			
			for(int j=0 ; j<rep ; j++) {
				reps[j] = sc.nextInt();
			}
			System.out.printf("#%d ", i);

			int temp;
			for(int j=0 ; j<rep-1 ; j++) {
				for(int k=j+1 ; k<rep ; k++) {
					if(reps[j] > reps[k]) {
						temp = reps[j];
						reps[j] = reps[k];
						reps[k] = temp;
					}
				}
			}
			
			int j=1, k=0, count=0;
			while(j<=student && count+1 <= student-rep) {
				if(k < rep) {
					if(j != reps[k]) {
						System.out.printf("%d ", j);
						count++;
					} else {
						k++;
					}
				} else {
					System.out.printf("%d ", j);
				}
				j++;
			}
			System.out.printf("\n");
		}
		
	}
}
