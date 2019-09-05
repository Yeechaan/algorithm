package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_5162 {
	public static void main(String []args) throws Exception, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			int sum = Integer.parseInt(st.nextToken());
			int count = 0;
			
			if(first <= second) {
				count = sum / first;
			}else {
				count = sum / second;
			}
			System.out.println("#" + i + " " + count);
		}
	}
}
