package algo0624;

import java.util.Scanner;

public class algo_1288 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=1 ; i<=t ; i++) {
			int n = sc.nextInt();

			int[] nums = new int[10];
			int sum=0;
			int mul=0;
			
			while(sum != 10) {
				sum=0;
				mul++;
				int number = n*mul;
				String sn = Integer.toString(number);
				int s = sn.length();
				
				for(int j=0 ; j<s ; j++) {
					
					switch(sn.charAt(j)) {
					case '0':
						nums[0]=1;
						break;
					case '1':
						nums[1]=1;
						break;
					case '2':
						nums[2]=1;
						break;
					case '3':
						nums[3]=1;
						break;
					case '4':
						nums[4]=1;
						break;
					case '5':
						nums[5]=1;
						break;
					case '6':
						nums[6]=1;
						break;
					case '7':
						nums[7]=1;
						break;
					case '8':
						nums[8]=1;
						break;
					case '9':
						nums[9]=1;
						break;
					}
				}
				for(int k=0 ; k<10 ; k++) {
					sum += nums[k];
				}
			}
			
			System.out.println("#" + i + " " + mul*n);
		}
		
	}
}
