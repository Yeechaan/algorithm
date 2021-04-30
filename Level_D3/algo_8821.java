package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class algo_8821 {
	
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			String numString = br.readLine();
			int count = 0;
			int[] checkNums = new int[10];
			
			for(int j=0 ; j<numString.length() ; j++) {
				int num = Character.getNumericValue(numString.charAt(j));
				
				if(checkNums[num] == 0) {
					checkNums[num] = 1;
				}else {
					checkNums[num] = 0;
				}
			}
			
			for(int j=0 ; j<10 ; j++) {
				if(checkNums[j] == 1) {
					count++;
				}
			}
		
			System.out.println("#" + i + " " + count);
		}
		
	}
}
