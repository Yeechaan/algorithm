package algo_D3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class algo_1244 {

	static StringBuilder sb = new StringBuilder();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;	
	
	public static void main(String args[]) throws IOException{
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			st = new StringTokenizer(br.readLine());
			String num = st.nextToken();
			int size = num.length();
			int count = Integer.parseInt(st.nextToken());
			int[] nums = new int[size];
			for(int j=0 ; j<size ; j++) {
				char temp = num.charAt(j);
				nums[j] = Character.getNumericValue(temp);
			}
			
			for(int j=0 ; j<count ; j++) {
				int flag=1, k=0, l, maxNum, maxIndex=0;
				while(k<size && flag==1) {
					maxNum = nums[k];
					maxIndex = k;
					for(l=size-1 ; l>=k+1 ; l--) {
						if(maxNum < nums[l]) {
							maxNum = nums[l];
							maxIndex = l;
						}
						
					}

					if(maxIndex != k) {
						flag = 0;
					} else {
						k++;
					}

				}
				int temp;
				if(maxIndex == size-1 && nums[maxIndex] == nums[maxIndex-1] && k != maxIndex) {
					if(k<size && nums[k] > nums[k+1]) {
						temp = nums[k];
						nums[k] = nums[maxIndex-1];
						nums[maxIndex-1] = temp;
					}
					else if (k<size){
						temp = nums[k];
						nums[k] = nums[maxIndex];
						nums[maxIndex] = temp;
					}
				} else if(k<size) {
					temp = nums[k];
					nums[k] = nums[maxIndex];
					nums[maxIndex] = temp;
				} else if(k == size && nums[size-2]!=nums[size-3]) {
					temp = nums[k-1];
					nums[k-1] = nums[maxIndex-1];
					nums[maxIndex-1] = temp;
				}
				
			}
			
			System.out.printf("#%d ", i);
			for(int j=0 ; j<size ; j++) {
				System.out.printf("%d", nums[j]);
			}
			System.out.printf("\n");
		}
	}
}
