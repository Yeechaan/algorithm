package algo0624;
import java.util.Scanner;

class algo_1984 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1 ; i<=test ; i++) {
			int[] nums = new int[10];
			
			for(int j=0 ; j<10 ; j++) {
				nums[j] = sc.nextInt();
			}
			
			int sum = 0;
			int minNum = nums[0];
			int maxNum = nums[0];
			
			for(int j=0 ; j<10 ; j++) {
				sum = sum + nums[j];
				
				if(minNum > nums[j]) {
					minNum = nums[j];
				}
				if(maxNum < nums[j]) {
					maxNum = nums[j];
				}
			}
			sum = sum - (minNum + maxNum);
			sum = (int) Math.round(sum/8.0);
			System.out.println("#" + minNum + " " + maxNum);

			System.out.println("#" + i + " " + sum);
		}	
	}
}

/**
    public static void greedy.main(String[] args) throws IOException {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int T = Integer.parseInt(br.readLine());
         
        for(int tc = 1; tc <=T; tc++) {
             
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
             
            for(int i = 0; i < 10; i ++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
                 
            Collections.sort(arr);
            double sum = 0;
            for(int i = 1 ; i < 9 ; i ++) {
                sum += arr.get(i);
            }
             
            System.out.println("#"+tc+" "+ Math.round(sum/8));
             
        }
         
    }
**/