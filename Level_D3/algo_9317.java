package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class algo_9317 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int size = Integer.parseInt(br.readLine());
			String sentence = br.readLine();
			String sentence_check = br.readLine();
			int res =0;
			
			for(int j=0 ; j<size ; j++) {
				if(sentence.charAt(j) == sentence_check.charAt(j)) {
					res++;
				}
			}
			
			System.out.println("#" + i + " " + res);
		}
		
	}

}
