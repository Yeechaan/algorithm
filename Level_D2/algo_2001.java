package algo0624;
import java.util.Scanner;

public class algo_2001 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
	
		for(int i=1 ; i<=test ; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[][] ns = new int[n][n];
			for(int j=0 ; j<n ; j++) {
				for(int k=0 ; k<n ; k++) {
					ns[j][k] = sc.nextInt();
				}
			}
			
			int maxSum = 0;
			int sum;
			int count = n - m + 1;
			for(int j=0 ; j<count ; j++) {
				
				for(int k=0 ; k<count ; k++) {
					sum = 0;

					for(int x=j ; x<m+j ; x++) {
						for(int y=k ; y<m+k ; y++) {
							sum += ns[x][y];
						}
					}
					if(maxSum <= sum) {
						maxSum = sum;
					}
				}
			}
			System.out.println("#" + i + " " + maxSum);
		}
	}
}
