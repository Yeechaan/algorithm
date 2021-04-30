package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class algo_7087 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		long beforeTime = System.currentTimeMillis();
		
		for(int i=1 ; i<=test ; i++) {
			int num = Integer.parseInt(br.readLine());
			int[] title = new int[num];
			int count = 0;
			
			for(int j=0 ; j<num ; j++) {
				String words = br.readLine();
				title[j] = (int) words.charAt(0);
			}
			
			int check = 65;
			int j=0, k, flag=0, temp;
			
			while(j<num && flag==0) {
				for(k=j+1 ; k<num ; k++) {
					if(title[j] > title[k]) {
						temp = title[j];
						title[j] = title[k];
						title[k] = temp;
					}
				}
				
				if(title[j] == check) {
					count++;
					check++;
				} 
				else if(title[j] != check-1) {
					flag = 1;
				}
				j++;
				
			}	
			System.out.println("#" + i + " " + count);
		}
		
		long afterTime = System.currentTimeMillis();
		long secDiff = (afterTime - beforeTime);
		System.out.println("#Total time : " + secDiff);
		
	}
}
