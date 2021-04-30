package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class algo_4789 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			String audience = br.readLine();
			int sumAudi=0 , minAudi=0;
			
			for(int j=0 ; j<audience.length() ; j++) {
				if(audience.charAt(j) == '0' && sumAudi<j+1) {
					minAudi++;
					sumAudi++;
				} else {
					sumAudi += Character.getNumericValue(audience.charAt(j));
				}
			}
			System.out.println("#" + i + " " + minAudi);
		}
	}

}
