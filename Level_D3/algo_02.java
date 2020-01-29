package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class algo_02 {
	public static int getSimpleMaxDifference(ArrayList<Integer> arr) {
		int res=-1, size=arr.size(), max_num=0, max_index=-1, next_num=0, next_index=-1, min_num;
		
		//3-1. Get max number, index and max_next number, index
		for(int i=0 ; i<size ; i++) {
			int num = arr.get(i);
			
			if(num > max_num) {
				max_num = num;
				max_index = i;
			}
			else {
				if(num < max_num && num > next_num) {
					next_num = num;
					next_index = i;
				}
			}
		}
		//3-2. If max_index is 0, change the max number, index to next one
		if(max_index == 0) {
			max_num = next_num;
			max_index = next_index;
		}
		//3-3. Get min number before max_index
		min_num=max_num;
		for(int i=0 ; i<max_index ; i++) {
			int num = arr.get(i);
			
			if(num < min_num) {
				min_num = num;
			}
		}
		//3-4. If max_num and min_num is same value, there is no differences in the array
		if(max_num != min_num) {
			res = max_num - min_num;
		}
				
		return res;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//1. Input number of Arrays
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> nums = new ArrayList<>();
		
		//2. Input items of Arrays in a Line
		for(int i=0 ; i<num ; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		//3. Get Simple Max Difference
		int res = getSimpleMaxDifference(nums);
		
		//4. Print the Simple Max Difference
		System.out.println(res);
		
		br.close();
	}
}
