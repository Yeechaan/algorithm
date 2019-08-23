package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class algo_7732 {
	public static void main(String []args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		for(int i=1 ; i<=test ; i++) {
			String timeCur = br.readLine();
			String timeApp = br.readLine();
			
			int curHo = Integer.parseInt(String.valueOf(timeCur.charAt(0)) + String.valueOf(timeCur.charAt(1)));
			int curMi = Integer.parseInt(String.valueOf(timeCur.charAt(3)) + String.valueOf(timeCur.charAt(4)));
			int curSe = Integer.parseInt(String.valueOf(timeCur.charAt(6)) + String.valueOf(timeCur.charAt(7)));
			
			int appHo = Integer.parseInt(String.valueOf(timeApp.charAt(0)) + String.valueOf(timeApp.charAt(1)));
			int appMi = Integer.parseInt(String.valueOf(timeApp.charAt(3)) + String.valueOf(timeApp.charAt(4)));
			int appSe = Integer.parseInt(String.valueOf(timeApp.charAt(6)) + String.valueOf(timeApp.charAt(7)));
						
			if(curHo > appHo) {
				appHo = appHo + 24;
			} 
			else if(curHo == appHo) {
				if(curMi > appMi) {
					appHo = appHo + 24;
				}
				else if(curMi == appMi) {
					if(curSe > appSe) {
						appHo = appHo + 24;
					}
				}
			}
			
			int lefHo, lefMi, lefSe;
			
			if(curSe > appSe) {
				if(appMi == 0) {
					appHo--;
					appMi += 60;
				}
				appMi = appMi - 1;
				appSe = appSe + 60;
			}
			lefSe = appSe - curSe;
			
			if(curMi > appMi) {
				appHo--;
				appMi += 60;
			}
			lefMi = appMi - curMi;
			lefHo = appHo - curHo;
			
			String lefTime="";
			
			if(lefHo < 10) {
				lefTime = '0' + String.valueOf(lefHo) + ':';
			} else {
				lefTime = String.valueOf(lefHo) + ':';
			}
			if(lefMi < 10) {
				lefTime += '0' + String.valueOf(lefMi) + ':';
			} else {
				lefTime += String.valueOf(lefMi) + ':';
			}
			if(lefSe < 10) {
				lefTime += '0' + String.valueOf(lefSe);
			} else {
				lefTime += String.valueOf(lefSe);
			}
			
			System.out.println("#" + i + " " + lefTime);
		}
	}
}
