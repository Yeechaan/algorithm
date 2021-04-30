package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_7102 {
	public static void main(String []args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int test = Integer.parseInt(bf.readLine());
		for(int i=1 ; i<=test ; i++) {
			st = new StringTokenizer(bf.readLine());
			int firCard = Integer.parseInt(st.nextToken());
			int secCard = Integer.parseInt(st.nextToken());
			int sum=1, firSum, secSum;
			
			System.out.printf("#%d ", i);
			if(firCard == secCard) {
				sum = sum + secCard;
				System.out.printf("%d", sum);
			}
			else {
				if(firCard > secCard) {
					firSum = sum + secCard;
					secSum = sum + firCard;
				}else {
					secSum = sum + secCard;
					firSum = sum + firCard;
				}
				for(int j=firSum ; j<=secSum ; j++) {
					System.out.printf("%d ", j);
				}
			}
			int max = Integer.MIN_VALUE;
			System.out.printf("\n + %d", max);
		}
	}
}
