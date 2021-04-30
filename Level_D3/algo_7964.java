package algo_D3;

import java.util.Scanner;

class algo_7964 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int city = sc.nextInt();
			int dis = sc.nextInt();
			int[] gates = new int[city];
			
			for(int j=0 ; j<city ; j++) {
				gates[j] = sc.nextInt();
			}
			
			int count=0, gateAdd=0;
			
			for(int j=0 ; j<city ; j++) {
				if(gates[j] == 0) {
					count++;
				} else {
					count=0;
				}
				
				if(count == dis) {
					gateAdd++;
					count=0;
				}
			}
			
			if(count != 0) {
				for(int j=0 ; j<dis ; j++) {
					if(gates[j] == 0) {
						count++;
					} else {
						count=0;
					}
					
					if(count == dis) {
						gateAdd++;
						count=0;
					}
				}
			}
			
			System.out.println("#" + i + " " + gateAdd);
		}
		sc.close();
	}
}

/*
import java.io.BufferedReader;
 
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Solution {
 
    public static void main(String[] args) throws Exception{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
        for(int tc=1 ; tc<=T; tc++) {
            st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            int D=Integer.parseInt(st.nextToken());
            int dis=1;
            int cnt=0;
             
            for(int i= 0 ;  i< N; i++) {
                if(br.read()=='0') {
                    if(dis==D) {
                    	dis=1;
                    	cnt++;
                    }
                    else {
                        dis++;
                    }
                }else 
                	dis=1;
                	
                if(i!=N-1)
                	br.read();
                else 
                	br.readLine();
            }
            System.out.println("#"+tc+" "+cnt);
        }
 
    }
 
}
 */
