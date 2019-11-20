package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_8888 {
	
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test_case ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int test = Integer.parseInt(st.nextToken());
			int position = Integer.parseInt(st.nextToken());
			int[][] scores = new int[num][test+2];
			int[] question_score = new int[test];
			
			for(int j=0 ; j<num ; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k=0 ; k<test ; k++) {
					scores[j][k] = Integer.parseInt(st.nextToken());
					if(scores[j][k] == 0) {
						question_score[k]++;
					}
				}
			}
			
			for(int j=0 ; j<num ; j++) {
				for(int k=0 ; k<test ; k++) {
					if(scores[j][k] == 1) {
						scores[j][test] += question_score[k];
						scores[j][test+1]++;
					}
				}
			}
			
			int rank = 1, scoreFinal = scores[position-1][test], scoreNum = scores[position-1][test+1];
			for(int j=0 ; j<position-1 ; j++) {
				if(scoreFinal < scores[j][test]) {
					rank++;
				}
				else if(scoreFinal == scores[j][test]) {
					if(scoreNum <= scores[j][test+1]) {
						rank++;
					}
				}
			}
			
			for(int j=position ; j<num ; j++) {
				if(scoreFinal < scores[j][test]) {
					rank++;
				}
				else if(scoreFinal == scores[j][test]) {
					if(scoreNum < scores[j][test+1]) {
						rank++;
					}
				}
			}			

			System.out.println("#" + i + " " + scoreFinal + " " + rank);
		}
	}
}
