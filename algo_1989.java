package algo0624;

import java.util.Scanner;

public class algo_1 {

    public static void main(String []args) throws Exception {
		
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {           
            String text = sc.next();
            char[] arr = text.toCharArray();
            int result = 1;
            for(int i=0; i<(text.length()/2);i++) {
                if(arr[i]!=arr[arr.length-i-1]) {
                	result = 0;
                }
                 
            }
            if(result==0) {
                System.out.println("#"+test_case+" "+result);
            } else {
                System.out.println("#"+test_case+" "+result);
            }
        }
    }
}
