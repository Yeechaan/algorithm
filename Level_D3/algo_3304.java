package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_3304 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int k=1 ; k<=test ; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			String compare = st.nextToken();
			
			int res = LCS(input, compare);
			
			System.out.println("#" + k + " " + res);
		}
	}

	private static int LCS(String input, String compare) {
		int[][] cache = new int[1001][1001];
		
		for(int i=1 ; i<=compare.length() ; i++) {
			for(int j=1 ; j<=input.length() ; j++) {
				
				if(compare.charAt(i-1) == input.charAt(j-1)) {
					cache[i][j] = cache[i-1][j-1] + 1;
				}
				else {
					cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
				}
			}
		}
		return cache[compare.length()][input.length()];
	}
}
