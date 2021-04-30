package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class algo_01 {
	
	public static int getCollision(ArrayList<Integer> arr, int pos) {
		int count=0, size=arr.size(), pos_speed=arr.get(pos);
		
		//3-1. Before position, count faster than pos_speed
		for(int i=0 ; i<pos ; i++) {
			if(arr.get(i) > pos_speed) {
				count++;
			}
		}
		
		//3-2. After position, count slower than pos_speed
		for(int i=pos+1 ; i<size ; i++) {
			if(arr.get(i) < pos_speed) {
				count++;
			}
		}
		
		return count;
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
		
		//3. Input position of collision course
		int pos = Integer.parseInt(br.readLine());
		
		//4. Count how many times collision happened in position
		int res = getCollision(nums, pos);
		
		//5. Print the count of collision
		System.out.println(res);
		
		br.close();
	}
	/*
	Input Example
	<1> -> 2
	8
	6 6 1 6 3 4 6 8
	2
	<2> -> 2
	10
	8 3 6 3 2 2 4 8 1 6
	7
	<3> -> 1
	6
	1 3 7 4 6 4
	3 
	*/
}
