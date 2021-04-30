package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class algo_4371 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int number = Integer.parseInt(br.readLine());
			int[] boats = new int[number];
			int numBoat = 0;
			
			int boat = Integer.parseInt(br.readLine());
			boats[numBoat] = Integer.parseInt(br.readLine()) - boat;
			numBoat++;
			
			for(int j=0 ; j<number-2 ; j++) {
				boat = Integer.parseInt(br.readLine());
				int k=0;
				while(k<numBoat && (boat-1)%boats[k]!=0) {
					
					k++;
				}
				if(k == numBoat) {
					boats[numBoat] = boat - 1;
					numBoat++;
				}
				
			}
			System.out.println("#" + i + " " + numBoat);
		}
	}
}
