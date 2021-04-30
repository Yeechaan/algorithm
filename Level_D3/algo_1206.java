package algo_D3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class algo_1206 {
	static StringBuilder sb = new StringBuilder();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;	
	
	public static int getMaxnum(int ll, int l, int r, int rr) {
		int higestNum = 0;
		int[] nums = {ll, l, r, rr};
		for(int k=0 ; k<4 ; k++) {
			if(nums[k] > higestNum) {
				higestNum = nums[k];
			}
		}
		
		return higestNum;
	}
	
	public static void main(String[] args) throws IOException{
		
		for(int i=1 ; i<=10 ; i++) {
			int size = Integer.parseInt(br.readLine());
			int res = 0;
			st = new StringTokenizer(br.readLine());
			int ll = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int rr = Integer.parseInt(st.nextToken());

			for(int j=5 ; j<size ; j++) {
				if(c>ll && c>l && c>r && c>rr) {
					int higestNum, temp;
					
					higestNum = getMaxnum(ll, l, r, rr);
					temp = c - higestNum;
					res += temp;
				}

				ll = l;
				l = c;
				c = r;
				r = rr;
				rr = Integer.parseInt(st.nextToken());

			}
			if(c>ll && c>l && c>r && c>rr) {
				int higestNum, temp;
				
				higestNum = getMaxnum(ll, l, r, rr);
				temp = c - higestNum;
				res += temp;
			}
			bw.write("#" + i + " " + res + "\n");
			//System.out.println("#" + i + " " + res);
		}
		bw.flush();
	}

}
