package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_9611 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int num = Integer.parseInt(br.readLine());
			int[] nums = new int[10];

			for(int j=0 ; j<num ; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int[] temps = new int[4];
				for(int k=0 ; k<4 ; k++) {
					temps[k] = Integer.parseInt(st.nextToken());
				}
				
				String ans = st.nextToken();
				if(ans.equals("YES")) {
					for(int k=0 ; k<4 ; k++) {
						nums[temps[k]] = 1;
					}
				}
				else if(ans.equals("NO")) {
					for(int k=0 ; k<4 ; k++) {
						nums[temps[k]] = 0;
					}
				}
			}
			
			int res=0;
			while(res<10 && nums[res]!=1) {
				res++;
			}
			if(res == 10) {
				res = -1;
			}
			
			System.out.println("#" + i + " " + res);
		}
		
	}

}
