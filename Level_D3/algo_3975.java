package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_3975 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a_win = Integer.parseInt(st.nextToken());
			int a_total = Integer.parseInt(st.nextToken());
			int b_win = Integer.parseInt(st.nextToken());
			int b_total = Integer.parseInt(st.nextToken());
			
			double a_per = (double)a_win / a_total;
			double b_per= (double)b_win / b_total;
			
			if(a_per == b_per) {
				System.out.println("#" + i + " " + "DRAW");
			}
			else if(a_per > b_per) {
				System.out.println("#" + i + " " + "ALICE");
			}
			else {
				System.out.println("#" + i + " " + "BOB");
			}
		}
		
	}

}
