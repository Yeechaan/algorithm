package algo_D3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class algo_8659 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String args[]) throws IOException{
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int num = Integer.parseInt(br.readLine());

			long[][] nums = new long[num+1][2];
			nums[1][0] = 2;
			nums[1][1] = 1;
			
			int j = 2;
			while(j<=num) {
				nums[j][1] = nums[j-1][0];
				nums[j][0] = nums[j-1][1] + nums[j-1][0];
				
				j++;
			}
			bw.write("#" + i + " " + nums[num][0] + " " + nums[num][1] + "\n");
		}
		bw.flush();
	}
}
