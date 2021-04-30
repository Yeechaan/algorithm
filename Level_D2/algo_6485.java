package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_6485 {
	public static void main(String []args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int numRou = Integer.parseInt(br.readLine());
			int[][] routes = new int[numRou][2];
			
			for(int j=0 ; j<numRou ; j++) {
				st = new StringTokenizer(br.readLine());
				routes[j][0] = Integer.parseInt(st.nextToken());
				routes[j][1] = Integer.parseInt(st.nextToken());	
			}
			System.out.printf("#%d", i);
			
			int numSta = Integer.parseInt(br.readLine());
			for(int j=0 ; j<numSta ; j++) {
				int station = Integer.parseInt(br.readLine());
				int count = 0;
				for(int k=0 ; k<numRou ; k++) {
					if(routes[k][0] <= station && routes[k][1] >= station) {
						count++;
					}
				}
				System.out.printf(" %d", count);
			}
			System.out.printf("\n");
		}
	}
}
