package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_8658 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int[] nums = new int[10];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<10 ; j++) {
				nums[j] = Integer.parseInt(st.nextToken());
			}
			
			int maxNum = 0, minNum = 0;
			for(int j=0 ; j<10 ; j++) {
				int sum = 0;
				String numSt = String.valueOf(nums[j]);
				
				for(int k=0 ; k<numSt.length() ; k++) {
					sum += Character.getNumericValue(numSt.charAt(k));
				}
				if(j==0) {
					maxNum = sum;
					minNum = sum;
				}
				if(sum >= maxNum) {
					maxNum = sum;
				}
				if(sum <= minNum) {
					minNum = sum;
				}
			}
			System.out.println("#" + i + " " + maxNum + " " + minNum);
		}
	}

}
