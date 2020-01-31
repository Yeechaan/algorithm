package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class algo_04 {
	public static int getCustomSortedArray(ArrayList<Integer> nums) {
		int count=0, left=0, right=nums.size()-1, left_num, right_num;
		
		//3-1. Count number of changed in arrays
		while(left < right) {
			left_num = nums.get(left);
			right_num = nums.get(right);
			
			if((left_num%2)==0 && (right_num%2)==0) {
				left++;
			}
			else if((left_num%2)==0 && (right_num%2)==1) {
				left++;
				right--;
			}
			else if((left_num%2)==1 && (right_num%2)==0) {
				nums.set(left, right_num);
				nums.set(right, left_num);
				count++;
				left++;
				right--;
			}
			else {
				right--;
			}
		}
		
		return count;
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
		
		//3. Get number of changed in arrays
		int res = getCustomSortedArray(nums);
		
		//3. Print number of changed in arrays
		System.out.println(res);
//		for(int i : nums){
//			System.out.println(i);
//		}
		
		br.close();
	}
}
