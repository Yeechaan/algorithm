package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_4299 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int day = Integer.parseInt(st.nextToken());
			int hour = Integer.parseInt(st.nextToken());
			int min = Integer.parseInt(st.nextToken());
			int resTime, passDay=0, passHour=0, passMin=0;
			
			if(day==11 && (hour<11 || min<11)) {
				resTime = -1;
			} else {
				passDay = day - 11;
				passHour = hour - 11;
				passMin = min - 11;
				
				if(passHour>=0 && passMin>=0) {
					resTime = passDay*24*60 + passHour*60 + passMin;
				} else if(passHour>=0 && passMin<0) {
					resTime = passDay*24*60 + (passHour-1)*60 + (passMin);
				} else if(passHour<0 && passMin>=0) {
					resTime = (passDay-1)*24*60 + (passHour+24)*60 + passMin;
				} else {
					resTime = (passDay-1)*24*60 + (passHour+23)*60 + (passMin+60);
				}
			}
			
			System.out.println("#" + i + " " + resTime);
		}
		
	}

}
