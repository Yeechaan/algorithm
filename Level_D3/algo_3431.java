import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class algo_3431{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int minExer = Integer.parseInt(st.nextToken());
			int maxExer = Integer.parseInt(st.nextToken());
			int exer = Integer.parseInt(st.nextToken());
			int res = -1;
			
			if(exer < minExer) {
				res = minExer - exer;
			}
			else if(exer < maxExer) {
				res = 0;
			}
			
			bw.write("#" + i + " " + res + "\n");
		}
		bw.flush();
	}
	
}