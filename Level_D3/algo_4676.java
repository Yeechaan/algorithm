package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_4676 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			String word = br.readLine();
			int size = word.length();
			int hNums[] = new int[size+1];
			
			StringBuffer words = new StringBuffer(word);
			int count = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<count ; j++) {
				int position = Integer.parseInt(st.nextToken());
				hNums[position]++;
			}
			
			for(int j=size ; j>=0 ; j--) {
				String ca = "";
				for(int k=0 ; k<hNums[j] ; k++) {
					ca = ca + "-";
				}
				words.insert(j, ca);
			}
			//words.insert(position, '-');
			System.out.println("#" + i + " " + words);
		}
	}
}
