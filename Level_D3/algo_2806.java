package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algo_2806 {
	static int ans, n;
	static int[] col;
	
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			n = Integer.parseInt(br.readLine());

			for (int j = 1; j <= n; j++) {
		        col = new int[15];
		        col[1] = j;
		        dfs(1);
		    }
		    System.out.println("#" + i + " " + ans);
		    ans=0;
		}
		
	}
	public static void dfs(int row) {

	    if (row == n) {
	        ++ans;
	    } else {
	        for (int i = 1; i <= n; i++) {
	            col[row + 1] = i;
	            if (isPossible(row + 1)) {
	                dfs(row + 1);
	            } else {
	                col[row + 1] = 0;    
	            }
	        }
	    }
	    col[row] = 0;
	}
	 
	public static boolean isPossible(int c) {
	    for (int i = 1; i < c; i++) {
	        if (col[i] == col[c]) {
	            return false;
	        }
	        if (Math.abs(col[i] - col[c]) == Math.abs(i - c)) {
	            return false;
	        }
	    }
	    return true;
	}
}
