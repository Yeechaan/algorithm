package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_8998 {
	
	public void sort(int[][] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2][0];
        
        do{
            while(data[left][0] < pivot) left++;
            while(data[right][0] > pivot) right--;
            if(left <= right){    
            	int temp1 = data[left][1];
                data[left][1] = data[right][1];
                data[right][1] = temp1;
            	
                int temp = data[left][0];
                data[left][0] = data[right][0];
                data[right][0] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=test ; i++) {
			int num = Integer.parseInt(br.readLine());
			int[][] tests = new int[num][2];
			int res = 0, gap, temp;
			
			for(int j=0 ; j<num ; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				//number test
				tests[j][1] = Integer.parseInt(st.nextToken());
				//day
				tests[j][0] = Integer.parseInt(st.nextToken());
			}
			
			algo_8998 quick = new algo_8998();
			quick.sort(tests, 0, num - 1);

			//Arrays.parallelSort(tests, Comparator.comparingInt(o1 -> o1[0]));
			
			for(int j=num-1 ; j>0 ; j--) {
				gap = tests[j][0] - tests[j][1];
				if( gap < tests[j-1][0] ) {
					temp = tests[j-1][0] - gap;
					res += temp;
				}
			}
			res = tests[0][0] - tests[0][1] - res;
			
			System.out.println("#" + i + " " + res);
		}
		
	}
}