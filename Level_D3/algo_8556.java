package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algo_8556 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			String dir = br.readLine();
			int[] dirs = new int[100];
			int j=0, count=0;
			while(j < dir.length()) {

				if(dir.charAt(j) == 'n') {
					dirs[count] = 0;
					j += 5;
				}else {
					dirs[count] = 1;
					j += 4;
				}
				count++;
			}
			
			int res, l = count-1;
			if(dirs[l] == 0) {
				res = 0;
			}else {
				res = 90*calSquare(l);
			}
			l--;
						
			for(int k=0 ; k<count-1 ; k++) {
				if(dirs[l] == 0) {
					res = res - (90*calSquare(l));
				}else {
					res = res + (90*calSquare(l));
				}
				l--;
			}
			
			while(count > 1 && res%2 == 0) {
				res = res/2;
				count--;
			}
			
			if(count > 1) {
				int resDown = calSquare(count-1);
				System.out.println("#" + i + " " + res + "/" + resDown);
			}else {
				System.out.println("#" + i + " " + res);
			}
		}
		
	}
	
	public static int calSquare(int num) {
		int res = 1;
		for(int i=0 ; i<num ; i++){
			res *= 2;
		}
		return res;
	}
}
