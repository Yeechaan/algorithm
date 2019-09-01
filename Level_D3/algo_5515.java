package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_5515 {
	public static void main(String []args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int month = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			int calDay = 4;
			
			switch(month) {
			case 1:
				break;
			case 2:
				calDay += 3;
				break;
			case 3:
				calDay += 4;
				break;
			case 4:
				calDay += 7;
				break;
			case 5:
				calDay += 9;
				break;
			case 6:
				calDay += 12;
				break;
			case 7:
				calDay += 14;
				break;
			case 8:
				calDay += 17;
				break;
			case 9:
				calDay += 20;
				break;
			case 10:
				calDay += 22;
				break;
			case 11:
				calDay += 25;
				break;
			case 12:
				calDay += 27;
				break;
			default:
			}
			calDay = calDay%7;
			calDay = (calDay + (day-1))%7;
			
			System.out.println("#" + i + " " + calDay);
		}
	}
}
