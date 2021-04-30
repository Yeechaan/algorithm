package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class algo_03 {
	public static int getMinimumStartValue(ArrayList<Integer> nums) {
		int size=nums.size(), running_sum=1;
		
		//3-1. running_sum would not less than 1
		for(int i=size-1 ; i>=0 ; i--) {
			int num = nums.get(i);
			
			if(num > 0) {
				running_sum = running_sum - num;
				
				if(running_sum < 1) {
					running_sum = 1;
				}
			}
			else {
				running_sum = running_sum + (num*-1);
			}	
		}
		
		return running_sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. Input number of Arrays
		int num = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> nums = new ArrayList<>();

		// 2. Input items of Arrays in a Line
		for (int i = 0; i < num; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		//3. Get Minimum Start Value
		int res = getMinimumStartValue(nums);
		
		//3. Print Minimum Start Value
		System.out.println(res);
		
		br.close();
	}

}
