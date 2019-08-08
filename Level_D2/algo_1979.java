package algo0624;

import java.util.Scanner;

public class algo_1979 {

	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int testCase=1 ; testCase<=T ; testCase++) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();
			int count = 0;
		
			int[][] puzzle = new int[N][N];
			for(int i=0 ; i<N ; i++) {
				for(int j=0 ; j<N ; j++) {
					puzzle[i][j] = scanner.nextInt();
				}
			}
			count = getCount(puzzle, N, K);
			System.out.println("#" + testCase + " " + count);
		}
	}
	
	public static int getCount(int[][] p, int n, int k) {
		int count=0;
		
		for(int i=0 ; i<n ; i++) {
			int size=1;
			
			//horizontal
			for(int j=0 ; j<n-1 ; j++) {
				
				if(p[i][j] == 1) {
					if(p[i][j+1] == 1) {
						size++;
					}
					else {
						size = 1;
					}
				}
				else {	
					size = 1;						
				}
				
				if(size == k) {
					if(j+1 <= n-1) {
						if(j+1 == n-1) {
							count++;
						}
						else if(p[i][j+2] == 0) {
							count++;
							size = 1;
							j+=2;
						}
					}
				}
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			int size=1;
			
			//horizontal
			for(int j=0 ; j<n-1 ; j++) {
				
				if(p[j][i] == 1) {
					if(p[j+1][i] == 1) {
						size++;
					}
					else {
						size = 1;
					}
				}
				else {	
					size = 1;						
				}
				
				if(size == k) {
					if(j+1 <= n-1) {
						if(j+1 == n-1) {
							count++;
						}
						else if(p[j+2][i] == 0) {
							count++;
							size = 1;
							j+=2;
						}
					}
				}
			}
		}
		
		return count;
	}
}
