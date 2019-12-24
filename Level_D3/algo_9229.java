package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_9229 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int limit = Integer.parseInt(st.nextToken());
			int res = -1, temp;
			
			int[] nums = new int[num];
			st = new StringTokenizer(br.readLine());
			
			for(int j=0 ; j<num ; j++) {
				nums[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=0 ; j<num-1 ; j++) {
				
				for(int k=j+1 ; k<num ; k++) {
					temp = nums[j] + nums[k];
					
					if(temp <= limit) {
						if(temp >= res) {
							res = temp;
						}
					}
					if(res == limit) {
						break;
					}
				}
			}
			
			System.out.println("#" + i + " " + res);
		}
		
		
	}

}
