package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algo_7087 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int num = Integer.parseInt(br.readLine());
			int[] title = new int[num];
			int count = 0;
			
			for(int j=0 ; j<num ; j++) {
				String words = br.readLine();
				title[j] = (int) words.charAt(0);
				//System.out.println("# " + (char)title[j]);
			}
			
			int check = 65;
			int j=0, k;
			
			while(j<num) {
				for(k=j+1 ; k<num ; k++) {
					if(title[j] > title[k]) {
						int temp = title[j];
						title[j] = title[k];
						title[k] = temp;
					}
				}
				if(title[j] == check) {
					//System.out.println("@ " + (char)title[j]);
					count++;
					check++;
				}
				
				j++;
			}	
			System.out.println("#" + i + " " + count);
		}
	}
}
