package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class algo_5948 {
	public static void main(String []args) throws Exception, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());

		for(int i=1 ; i<=test ; i++) {
			int[] nums = new int[7];

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0 ; j<7 ; j++) {
				nums[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(nums);
			
			int count=0;
			int[] ranks = new int[25];
			
			for(int j=6 ; j>=5 ; j--) {
				for(int k=j-1 ; k>=0 ; k--) {
					for(int l=k-1 ; l>=0 ; l--) {
						ranks[count] = nums[j] + nums[k] + nums[l];
						count++;
					}
				}
			}
			Arrays.sort(ranks);
			
			int j=24;
			count = 1;
			while(count != 5 && j>=0) {
				if(ranks[j] > ranks[j-1]) {
					count++;
				}
				j--;
			}
		
			System.out.println("#" + i + " " + Arrays.toString(ranks) + " " + ranks[j]);
		}
		
	}
}
