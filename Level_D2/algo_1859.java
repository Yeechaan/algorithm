package algo0624;

import java.util.Scanner;

public class algo_1859 {

	public static void main(String []args) throws Exception{
		
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        
        for(int i=1 ; i<=T ; i++){
            int day;
            day = sc.nextInt();
            int[] costs = new int[day];
            for(int j=0 ; j<day ; j++){
                costs[j] = sc.nextInt();
            }

            long profit=0;
            int stanIndex=day-1;
            int comIndex=stanIndex-1;
            for(int j=0 ; j<day-1 ; j++){

                if(costs[stanIndex] > costs[comIndex]){
                    profit = profit + (costs[stanIndex] - costs[comIndex]);
                    
                }
         		else if(costs[stanIndex] <= costs[comIndex]){
                    stanIndex = comIndex;
                }
                comIndex = comIndex-1;
            }
            
            System.out.println("#" + i + " " + profit);
            
        }
	}
	
}
