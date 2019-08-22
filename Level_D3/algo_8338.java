package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_8338 {
	public static void main(String []args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int num = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int sum = Integer.parseInt(st.nextToken());

			for(int j=1 ; j<num ; j++) {
				int next = Integer.parseInt(st.nextToken());

				if((sum==0 || next==0) || (sum==1 || next==1)) {
					sum = sum + next;
				} else {
					sum = sum * next;
				}
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}