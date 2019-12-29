package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_3304 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int k=1 ; k<=test ; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String arrA = '0' + st.nextToken();
			String brrB = '0' + st.nextToken();
			int length = arrA.length();
			char[] arr = new char[1001];
			char[] brr = new char[1001];

			for(int i=0 ; i<length ; i++) {
				arr[i] = arrA.charAt(i);
				brr[i] = brrB.charAt(i);
			}
			
			int[][] LCS = new int[1001][1001];
			int ans=0, i, j;
			
			for (i = 1; arr[i] != 0; i++) {
		        for (j = 1; brr[j] != 0; j++) {
		 
		            if (arr[i] == brr[j])
		            	LCS[i][j] = LCS[i-1][j-1] + 1; //같으면 대각선+1
		            else {
		                if (LCS[i - 1][j]< LCS[i][j - 1])
		                	LCS[i][j] = LCS[i][j - 1];//다르면 왼쪽과 위
		                else 
		                	LCS[i][j] = LCS[i - 1][j];
		            }
		 
		            if (ans < LCS[i][j])
		            	ans = LCS[i][j]; // 최장길이갱신
		        }
		    }
			
//			while(j<length && k<length) {
//				
//				temp = k;
//				while(temp < length) {
//					if(wordA.charAt(j) == wordB.charAt(temp)) {
//						k = temp + 1;
//						res++;
//						break;
//					}
//					temp++;
//				}
//				
//				j++;
//			}
			System.out.println("#" + k + " " + ans);
			
		}
	}

}
