import java.util.Scanner;

public class algo_1948 {
	public static void main(String []args) {

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		int monthDay[][] = new int[12][2];
		//1/31, 2/28, 3/31, 4/30, 5/31, 6/30, 7/31, 8/31, 9/30, 10/31, 11/30, 12/31
		for(int j=0 ; j<12 ; j++) {
			monthDay[j][0]=j+1;
		}
		monthDay[0][1]=31;
		monthDay[1][1]=28;
		monthDay[2][1]=31;
		monthDay[3][1]=30;
		monthDay[4][1]=31;
		monthDay[5][1]=30;
		monthDay[6][1]=31;
		monthDay[7][1]=31;
		monthDay[8][1]=30;
		monthDay[9][1]=31;
		monthDay[10][1]=30;
		monthDay[11][1]=31;
		
		for(int i=1 ; i<=test ; i++) {
			int firMon = sc.nextInt();
			int firDay = sc.nextInt();
			int secMon = sc.nextInt();
			int secDay = sc.nextInt();
			
			int diffDay;
			
			if(firMon == secMon) {
				diffDay = secDay - firDay + 1;
			}
			else {
				diffDay = secDay + (monthDay[firMon-1][1] - firDay + 1);
			
				int k = firMon+1;
				while(k < secMon) {
					diffDay = diffDay + monthDay[k-1][1];
					k++;
				}
			}
			System.out.println("#" + i + " " + diffDay);		
		}
		sc.close();
	}
}
