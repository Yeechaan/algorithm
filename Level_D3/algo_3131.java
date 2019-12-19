package algo_D3;

public class algo_3131 {
	
	public static void main(String[] args) {
		
		for(long i=2 ; i<=1000000 ; i++) {

			int flag = 0, count = 0;
			long j = 2;
			while(j<=i && count == 0) {
				if(i%j == 0 && j<i/2) {
					count++;
				}
				j++;
			}
			if(i == j-1) {
				System.out.println(i );
			}
		}
	}

}
