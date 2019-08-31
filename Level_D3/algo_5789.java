package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_5789 {
	public static void main(String []args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int test = Integer.parseInt(br.readLine());
		for(int i=1 ; i<=test ; i++) {
			st =new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int con = Integer.parseInt(st.nextToken());
			int[] nums = new int[num];
			//Arrays.fill(nums, 0);
			
			for(int j=0 ; j<con ; j++) {
				st =new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				
				for(int k=start ; k<=end ; k++) {
					nums[k-1] = j+1;
				}
			}
			
			System.out.print("#" + i);
			for(int j=0 ; j<num ; j++) {
				System.out.printf(" " + nums[j]);
			}
            System.out.println();
		}
	}
}
