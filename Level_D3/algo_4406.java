package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class algo_4406 {
	public static void main(String []args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			String word = br.readLine();
			String resWord = "";
			
			for(int j=0 ; j<word.length() ; j++) {
				if(word.charAt(j)!='a' && word.charAt(j)!='i' && word.charAt(j)!='o' && word.charAt(j)!='u' && word.charAt(j)!='e') {
					resWord += word.charAt(j);
				}
			}
			System.out.println("#" + i + " " + resWord);
		}	
	}
}
