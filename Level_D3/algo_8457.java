package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_8457 {

	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int sec = Integer.parseInt(st.nextToken());
			int err = Integer.parseInt(st.nextToken());
			int minRange = sec-err, maxRange = sec+err;
			int count = 0;
			int[] nums = new int[num];
			
			st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<num ; j++) {
				nums[j] = Integer.parseInt(st.nextToken());
			}

			for(int j=0 ; j<num ; j++) {
				int k = 0, flag = 0;
				int maxSum = nums[k];
				
				while(maxSum <= maxRange && flag == 0) {
					if(maxSum >= minRange && maxSum <= maxRange) {
						flag = 1;
						count ++;
					}
					k++;
					maxSum = nums[j]*(k+1);
					//System.out.println("#" + maxSum + " ");

				}
			}
			System.out.println("#" + i + " " + count);
		}
	}
}
