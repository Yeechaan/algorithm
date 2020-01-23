package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class algo_9280 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=tc ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			int motor = Integer.parseInt(st.nextToken());
			int[][] numRates = new int[2][number];
			int[][] motWeights = new int[2][motor];
			
			for(int j=0 ; j<number ; j++) {
				numRates[0][j] = Integer.parseInt(br.readLine());
			}
			
			for(int j=0 ; j<motor ; j++) {
				motWeights[0][j] = Integer.parseInt(br.readLine());
			}
						
			int order, size = 0, res = 0, temp;
			Queue<Integer> q = new LinkedList<>();

			for(int j=0 ; j<2*motor ; j++) {
				order = Integer.parseInt(br.readLine());
				
				//3-2. 양수이면,
				if(order > 0) {
					order = order - 1;
					
					//3-2-1. 빈 공간이 있으면,
					if(size < number) {
						int k=0;
						while(k<number) {
							if(numRates[1][k] == 0) {
								break;
							}
							k++;
						}
						numRates[1][k] = order+1;
						motWeights[1][order] = k;
						size++;

					}
					//3-2-2. 없으면,
					else {
						q.add(order);
					}
				}
				
				//3-3. 음수이면,
				else {
					order = order * -1;
					order = order - 1;

					temp = numRates[0][motWeights[1][order]] * motWeights[0][order];
					res += temp;
					numRates[1][motWeights[1][order]] = 0;
					size--;
					
					if(q.size() != 0) {
						order = q.remove();
						
						int k=0;
						while(k<number) {
							if(numRates[1][k] == 0) {
								break;
							}
							k++;
						}
						numRates[1][k] = order+1;
						motWeights[1][order] = k;
						size++;
					}
				}
				
			}
			System.out.println("#" + i + " " + res);
		}	
	}
}
