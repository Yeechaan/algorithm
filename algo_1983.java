package algo0624;

import java.util.Scanner;

public class algo_1983 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int n = sc.nextInt();
			double[][] scores = new double[n][5];
			int k = sc.nextInt();
			
			for(int j=0 ; j<n ; j++) {
				scores[j][0] = sc.nextInt();
				scores[j][1] = sc.nextInt();
				scores[j][2] = sc.nextInt();
				
				scores[j][3] = (scores[j][0] * 0.35) + (scores[j][1] * 0.45) + (scores[j][2] * 0.2);
				scores[j][4] = scores[j][3];

			}
		 
			for(int j=0 ; j<n-1 ; j++) {
				for(int l=j+1 ; l<n ; l++) {
					if(scores[j][4] < scores[l][4]) {
						double temp = scores[j][4];
						scores[j][4] = scores[l][4];
						scores[l][4] = temp;
					}
				}
			}
			
			int rankk=0;
			int j=0;
			while(j<n){
				if(scores[k-1][3]==scores[j][4]) {
					rankk = j+1;
				}
				j++;
			}
			double rank;
			rank =  rankk*1.0 / (n/10)*1.0;
			String rankch="";
			
			if(rank > 0.0 && rank <=1.0) {
				rankch = "A+";
			} else if(rank > 1.0 && rank <=2.0) {
				rankch = "A0";
			} else if(rank > 2.0 && rank <=3.0) {
				rankch = "A-";
			} else if(rank > 3.0 && rank <=4.0) {
				rankch = "B+";
			} else if(rank > 4.0 && rank <=5.0) {
				rankch = "B0";
			} else if(rank > 5.0 && rank <=6.0) {
				rankch = "B-";
			} else if(rank > 6.0 && rank <=7.0) {
				rankch = "C+";
			} else if(rank > 7.0 && rank <=8.0) {
				rankch = "C0";
			} else if(rank > 8.0 && rank <=9.0) {
				rankch = "C-";
			} else if(rank > 9.0 && rank <=10.0) {
				rankch = "D0";
			}
			
			System.out.println("#" + i + " " + rankch);
			//System.out.println(n + " " + k + " " + rr);

		}
	}
}
