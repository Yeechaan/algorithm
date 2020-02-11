package algo_D3;

import java.util.HashMap;
import java.util.Scanner;

public class algo_test_1 {
	
	public static int[] getTwoSum(int[] nums, int target){
		//exception process
		if(nums == null || nums.length<2) {
			return new int[] {0, 0};
		}

		//To optimize the code, i have to use HashMap instead 2 while loops
		//I don't have to put all numbers in the HashMap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0 ; i<nums.length ; i++) {
			if(map.containsKey(nums[i])) {
				return new int[] {map.get(nums[i]), i};
			}
			else {
				map.put(target-nums[i], i);
			}
			
		}
		return new int[] {0, 0};
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input size of arrays and items");
		int size = sc.nextInt();
		int[] nums = new int[size];
		
		for(int i=0 ; i<size ; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Input target number");
		int target = sc.nextInt();

		int[] res = new int[2];
		res = getTwoSum(nums, target);
		
		System.out.println(res[0] + " " + res[1]);
		
		sc.close();
	}

}
