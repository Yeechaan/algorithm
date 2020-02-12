package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class algo_9480 {
	static public int count;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int size = Integer.parseInt(br.readLine());
			ArrayList<String> words = new ArrayList<String>();
			int [] arr = new int[size];
			
//			for(int j=0 ; j<size ; j++) {
//				words.add(br.readLine());
//			}
			
			count = 0;

			for(int j=0 ; j<size ; j++) {
				combination(arr, 0, size, j+1, 0);				
				
			}
			
			System.out.println("#" + i + " " + count);
		}
		br.close();
	}
	
	public static void combination(int[] arr, int index, int n, int r, int target) { 
		if (r == 0) 
			print(arr, index); 
		else if (target == n) 
			return; 
		else { 
			arr[index] = target; 
			combination(arr, index + 1, n, r - 1, target + 1); 
			combination(arr, index, n, r, target + 1); 
		} 
	}
		
	public static void print(int[] arr, int length) { 
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println(""); 
		count++;

	}

}
