package algo0624;

import java.util.Scanner;

class algo_1974 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] numbers = new int[9][9];

		
		for(int i=1 ; i<=T ; i++) {
			int result=1;
			int sumVer=0;
			int sumHor=0;
			
			for(int j=0 ; j<9 ; j++) {
				for(int k=0 ; k<9 ; k++) {
					numbers[j][k] = sc.nextInt();
				}
			}
			
			for(int j=0 ; j<9 ; j++) {
				for(int k=0 ; k<9 ; k++) {
					sumVer += numbers[j][k];
					sumHor += numbers[k][j];
				}
				if(sumVer != 45 || sumHor != 45) {
					result=0;
					break;
				}
				sumVer=0;
				sumHor=0;
			}
			
			int sln=0;
			int srn=0;
			int sum=0;
			int k=0;
			while(k<9 && result != 0) {
				sumVer=0;
				
				int ln=sln;
				for(int j=0 ; j<3 ; j++) {
					sum = numbers[ln][srn] + numbers[ln][srn+1] + numbers[ln][srn+2];
					sumVer += sum;
					ln+=1;
				}
				if(sumVer != 45) {
					result=0;
				}
				srn=srn+3;
				
				if(srn == 9) {
					sln=sln+3;
					srn=0;
				}
				k++;
			}
			
			System.out.println("result is : " + result);
		}
		
		sc.close();
	}

}
