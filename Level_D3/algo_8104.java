package algo_D3;

import java.util.Scanner;

public class algo_8104 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int number = sc.nextInt();
			int group = sc.nextInt();
			int[][] groups = new int[group][number];
			
			int num=1, check=0;
			for(int j=0 ; j<number ; j++) {
				if(check == 0) {
					for(int k=0 ; k<group ; k++) {
						groups[k][j] = num;
						num++;
					}
					check=1;
				} else {
					for(int k=group-1 ; k>=0 ; k--) {
						groups[k][j] = num;
						num++;
					}
					check=0;
				}
			}
			System.out.printf("#%d ", i);
			
			for(int j=0 ; j<group ; j++) {
				int sum=0;
				for(int k=0 ; k<number ; k++) {
					sum += groups[j][k];
				}
				System.out.printf("%d ", sum);
			}
			System.out.printf("\n");
		}
		sc.close();
	}
}