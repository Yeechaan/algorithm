package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_3142 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int numHorn = Integer.parseInt(st.nextToken());
			int numAni = Integer.parseInt(st.nextToken());
			int numUni=0, numTwin=0;
			
			numTwin = numHorn - numAni;
			numUni = numAni - numTwin;
			
			System.out.println("#" + i + " " + numUni + " " + numTwin);
		}
	}
}
