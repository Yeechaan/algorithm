package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class algo_8998_priorityqueue {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st;
			
			PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o2[1], o1[1]);
				}
			});
			
			for(int j=0 ; j<num ; j++) {
				st = new StringTokenizer(br.readLine());
				int numTest = Integer.parseInt(st.nextToken());
				int dayLimit = Integer.parseInt(st.nextToken());

				pq.add(new int[] {numTest, dayLimit});
			}
			
			int[] tests = pq.poll();
			int res = tests[1] - tests[0];
			
			while(!pq.isEmpty()) {
				tests = pq.poll();
				
				if(res < tests[1]) {
					res -= tests[0];
				} else {
					res = tests[1] - tests[0];
				}
			}
			
			System.out.println("#" + i + " " + res);
		}
		
	}

}
