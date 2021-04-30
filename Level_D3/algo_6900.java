package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_6900 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int numGoal = Integer.parseInt(st.nextToken());
			int numLottery = Integer.parseInt(st.nextToken());
			String[][] goals = new String[numGoal][2];
			String lottery;
			int sumScore=0;
			
			for(int j=0 ; j<numGoal ; j++) {
				st = new StringTokenizer(br.readLine());
				goals[j][0] = st.nextToken();
				goals[j][1] = st.nextToken();
			}
			
			for(int j=0 ; j<numLottery ; j++) {
				lottery = br.readLine();
				for(int k=0 ; k<numGoal ; k++) {
					int l=0, flag=0;
					while(l<8 && flag==0) {
						if(lottery.charAt(l) != goals[k][0].charAt(l)) {
							if(goals[k][0].charAt(l)=='*') {
							} 
							else {
								flag = 1;
							}
						}
						l++;
					}
					if(flag == 0) {
						sumScore += Integer.parseInt(goals[k][1]);
					}
				}
			}
			System.out.println("#" + i + " " + sumScore);			
		}
	}
}
