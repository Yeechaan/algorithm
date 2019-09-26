package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_6019 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double des = Double.parseDouble(st.nextToken());
			double trainFir = Double.parseDouble(st.nextToken());
			double trainSec = Double.parseDouble(st.nextToken());
			double fly = Double.parseDouble(st.nextToken());

			double flyTemp = des / (trainFir+trainSec);
			double flyDes = fly * flyTemp;
			
			//System.out.printf("#%d %.6f ", i, flyDes);
			//Compared function between printf() and prtinln(), second one's memory is less than first memory. 
			System.out.println("#" + i + " " + flyDes);
		}
	}
}
