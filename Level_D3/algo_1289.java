import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class algo_1289{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			String num = br.readLine();
			int res = 0;
			
			if(num.charAt(0) == '1'){
				res++;
			}
			
			for(int j=1 ; j<num.length() ; j++) {
				if(num.charAt(j) == '0') {
					if(num.charAt(j-1) == '1') {
						res++;
					}
				}
				else {
					if(num.charAt(j-1) == '0') {
						res++;
					}
				}
			}
			System.out.println("#" + i + " " + res);
		}
	}
}