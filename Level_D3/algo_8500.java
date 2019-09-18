package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_8500 {

	public static void main(String []args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int count = Integer.parseInt(br.readLine());
			//int[] seats = new int[count];
			StringTokenizer st = new StringTokenizer(br.readLine());
			int minSeat = 0, maxNum = 0, num;
			
			for(int j=0 ; j<count ; j++) {
				num = Integer.parseInt(st.nextToken());
				minSeat += num;
				if(maxNum < num){
					maxNum = num;
				}
			}
			
			minSeat = minSeat + maxNum + count;
			System.out.println("#" + i + " " + minSeat);
		}
		
	}
}
