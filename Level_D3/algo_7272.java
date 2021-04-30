package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_7272 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String wordFir = st.nextToken();
			String wordSec = st.nextToken();
			int flagLength=0, flagChar=0, j=0;
			
			if(wordFir.length() == wordSec.length()) {
				flagLength = 1;
			}
			flagChar = comChar(wordFir.charAt(j), wordSec.charAt(j));
			j++;
			
			while(flagLength==1 && flagChar==1 && j<wordFir.length()) {
				flagChar = comChar(wordFir.charAt(j), wordSec.charAt(j));
				j++;
			}
			
			if(flagLength==1 && flagChar==1 && j==wordSec.length()) {
				System.out.println("#" + i + " " + "SAME");
			}else {
				System.out.println("#" + i + " " + "DIFF");
			}
		}
		
	}
	
	public static int comChar(char a, char b) {
		int flagFir=0, flagSec=0, flagChar=0;
		
		if(a=='A' || a=='D' || a=='O' || a=='P' || a=='Q' || a=='R') {
			flagFir=1;
		} else if(a=='B') {
			flagFir=2;
		} else if(a=='C' || a=='E' || a=='F' || a=='G' || a=='H' || a=='I' || a=='J' || a=='K' || a=='L' || a=='M' || a=='N' || a=='S' || a=='T' || a=='U' || a=='V' || a=='W' || a=='X' || a=='Y' || a=='Z') {
			flagFir=0;
		}
		
		if(b=='A' || b=='D' || b=='O' || b=='P' || b=='Q' || b=='R') {
			flagSec=1;
		} else if(b=='B') {
			flagSec=2;
		} else if(b=='C' || b=='E' || b=='F' || b=='G' || b=='H' || b=='I' || b=='J' || b=='K' || b=='L' || b=='M' || b=='N' || b=='S' || b=='T' || b=='U' || b=='V' || b=='W' || b=='X' || b=='Y' || b=='Z') {
			flagSec=0;
		}
		
		if(flagFir == flagSec) {
			flagChar=1;
		}
		
		return flagChar;
	}

}
