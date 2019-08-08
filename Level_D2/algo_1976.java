package algo0624;

import java.util.Scanner;

public class algo_1976 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=1 ; i<=t ; i++) {
			int ft = sc.nextInt();
			int fm = sc.nextInt();
			int st = sc.nextInt();
			int sm = sc.nextInt();
			int nt;
			int nm;
			
			nt = ft + st;
			nm = fm + sm;
			
			if(nm >= 60) {
				nt += 1;
				nm -= 60;
			}
			if(nt > 12) {
				nt -= 12;
			}
			System.out.println("#" + i + " " + nt + " " + nm);
		}
		sc.close();
	}
}

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int T = Integer.parseInt(br.readLine().trim());
         
        for (int t = 0; t < T; t++) {
            int hour = 0;
            int minute = 0;
            int[] input = new int[4];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < input.length; i++) {
                input[i] = Integer.parseInt(st.nextToken().trim());
            }
            hour = input[0]+input[2] > 12 ? input[0]+input[2]-12 : input[0]+input[2];
            minute = input[1]+input[3];
            if(minute>59) {
                minute-=60;
                hour++;
            }
             
            System.out.printf("#%d %d %d\n", t+1, hour, minute);
        }
         
         
         
        br.close();
    }   // end of main
}
*/