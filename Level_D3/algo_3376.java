package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algo_3376 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int resOrder = Integer.parseInt(br.readLine());
			long[] sequence;
			if(resOrder > 5) {
				sequence = new long[resOrder];
			}else {
				sequence = new long[5];
			}

			sequence[0] = 1;
			sequence[1] = 1;
			sequence[2] = 1;
			sequence[3] = 2;
			sequence[4] = 2;
			
			for(int j=5 ; j<resOrder ; j++) {
				sequence[j] = sequence[j-1] + sequence[j-5];
			}
			System.out.println("#" + i + " " + sequence[resOrder-1]);
		}
	}
}
