package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class algo_7510 {
	public static void main(String []args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int test = Integer.parseInt(bf.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			double numDouble = Integer.parseInt(bf.readLine());
			int num;
			int sum, count=1, j, k;
			int flag=1;
			
			num = (int)numDouble;
			numDouble = Math.round(numDouble/2.0);
			j = (int)numDouble;
			
			while(j > 1 && flag == 1) {
				k=j;
				sum = 0;
				sum += k;
				while(num >= sum && k > 0) {
					if(num == sum) {
						count++;
					}
					k--;
					sum += k;
				}
				if(num > sum) {
					flag = 0;
				}
				j--;
			}
			System.out.println("#" + i + " " + count);
		}
	}
}

