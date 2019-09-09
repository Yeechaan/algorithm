package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_4466 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int numSubject = Integer.parseInt(st.nextToken());
			int numSelect = Integer.parseInt(st.nextToken());
			int[] scores = new int[numSubject];
			st = new StringTokenizer(br.readLine());
			
			for(int j=0 ; j<numSubject ; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
			}
			
			int temp, sum=0;
			for(int j=0 ; j<numSelect ; j++) {
				for(int k=j+1 ; k<numSubject ; k++) {
					if(scores[j] < scores[k]) {
						temp = scores[k];
						scores[k] = scores[j];
						scores[j] = temp;
					}
				}
				sum += scores[j];
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}
