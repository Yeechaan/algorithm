package algo_D3;

import java.util.Scanner;

class algo_7728 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int num = sc.nextInt();
			String nums = Integer.toString(num);
			char[] checks = new char[10];
			int count=0;
			int j=1;
			
			checks[count] = nums.charAt(0);
			count++;
			
			while(j<nums.length() && count<=10) {
				int k=0;
				while(k<count && nums.charAt(j)!=checks[k]) {
					if(k+1 == count) {
						checks[count] = nums.charAt(j);
						count++;
					}
					k++;
				}
				j++;
			}
			
			
			System.out.println(count);
		}
		
		
	}
}
