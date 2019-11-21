package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algo_8840 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			long num = Integer.parseInt(br.readLine());
			long sum;
			
			//sum = (long)Math.pow(((num-1)/2), 2);
			
			//This code is faster than the upper one(system function)
			sum = ((num-1)/2);
			sum = sum*sum;
			
			System.out.println("#" + i + " " + sum);
		}
	}
}
