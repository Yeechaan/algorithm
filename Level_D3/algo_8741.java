package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_8741 {

	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String resWord = "";
			
			for(int j=0 ; j<3 ; j++) {
				resWord += st.nextToken().charAt(0);
			}
			
			resWord = resWord.toUpperCase();
			System.out.println("#" + i + " " + resWord);
		}
		
	}
}
