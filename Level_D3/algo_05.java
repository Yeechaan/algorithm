package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class algo_05 {
	public static long getCommonPrefixLength(String word) {
		long size=word.length(), count=size;
		int j=0, k, pre_count=0;
		char first_char = word.charAt(0);
		
		while(j<size && first_char==word.charAt(j)) {
			j++;
		}
		pre_count = j - 1;
		
		for(int i=1 ; i<size ; i++) {
			j=0;
			k=i;
			if(pre_count == 0) {
				while(k<size && word.charAt(j)==word.charAt(k)) {
					count++;
					j++;
					k++;
				}
			}
			else {
				count = count + pre_count;
				pre_count--;
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		for(int i=0 ; i<test_case ; i++) {
			String word = br.readLine();
			
			long res = getCommonPrefixLength(word);
			
			System.out.println(res);	
		}
		
		br.close();
	}

}
