package algo_D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_7675 {
	public static void main(String []args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int num = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			String sentence = st.nextToken();
			int j=0, count=0;
			
			int aa = st.countTokens();
			System.out.printf("#%d ", i);
			
			while(j<=aa) {
				int k=1;
				char start = sentence.charAt(0);
				char end = sentence.charAt(sentence.length()-1);
				
				if(Character.isUpperCase(start) == true) {
					//������ ���� ������ ���Ѵ�.
					while(k<sentence.length()-1 && Character.isLowerCase(sentence.charAt(k))) {
						k++;
					}
				}
				
				if(k == sentence.length()-1) {
					if(Character.isLowerCase(end) == true && Character.isUpperCase(start) == true) {
						count++;
					}
					else if((end=='.' || end=='!' || end=='?') && Character.isUpperCase(start) == true) {
						count++;
					}
				}
				
				if(end=='.' || end=='!' || end=='?') {
					System.out.printf("%d ", count);
					count=0;
				}
				if(j<aa) {
					sentence = st.nextToken();
				}
				j++;
			}
			System.out.printf("\n");
		}
	}
}
