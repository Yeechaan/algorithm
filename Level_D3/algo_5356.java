package algo_D3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class algo_5356 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		for(int i=1 ; i<=test ; i++) {
			String[] words = new String[5];
			int maxLength = 1;
			
			for(int j=0 ; j<5 ; j++) {
				words[j] = br.readLine();
				if(maxLength < words[j].length()) {
					maxLength = words[j].length();
				}
			}
			
			String res="";
			for(int j=0 ; j<maxLength ; j++) {
				for(int k=0 ; k<5 ; k++) {
					if(words[k].length() > j) {
						res = res + words[k].charAt(j);
					}
				}
			}
			bw.write("#" + i + " " + res + "\n");
		}
		bw.close();
	}
}
