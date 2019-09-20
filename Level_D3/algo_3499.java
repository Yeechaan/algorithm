package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_3499 {
	public static void main(String []args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int num = Integer.parseInt(br.readLine());
			String[] words = new String[num];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<num ; j++) {
				words[j] = st.nextToken();
			}
			int count;
			if(num%2 == 0) {
				count = num/2;
			} else {
				count = num/2 +1;
			}
			int firstDeck=0, secondDeck=count;
			String resWords = "";
			System.out.printf("#%d ", i);
			for(int j=0 ; j<count ; j++) {
				if(firstDeck < count) {
					//resWords += words[firstDeck];
					//resWords += " ";
					System.out.printf("%s ", words[firstDeck]);
					firstDeck++;
				}
				if(secondDeck < num) {
					//resWords += words[secondDeck];
					//resWords += " ";
					System.out.printf("%s ", words[secondDeck]);
					secondDeck++;
				}
			}
			System.out.printf("\n");
			//System.out.println("#" + i + " " + resWords);
		}
	}
}
