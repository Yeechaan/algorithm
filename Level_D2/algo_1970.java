package algo0624;

import java.util.Scanner;

public class algo_1970 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int n, temp;
		int ftt, tt, ft, t, fh, h, fif, ten;
		
		for(int i=1; i<=test ; i++) {
			n = sc.nextInt();
			ftt=0; tt=0; ft=0; t=0; fh=0; h=0; fif=0; ten=0;
		
			temp = n;
			if(temp >= 50000) {
				ftt = temp / 50000;
				temp = temp - (ftt*50000);
			}
			if(temp >= 10000) {
				tt = temp / 10000;
				temp = temp - (tt*10000);
			}
			if(temp >= 5000) {
				ft = temp / 5000;
				temp = temp - (ft*5000);
			}
			if(temp >= 1000) {
				t = temp / 1000;
				temp = temp - (t*1000);
			}
			if(temp >= 500) {
				fh = temp / 500;
				temp = temp - (fh*500);
			}
			if(temp >= 100) {
				h = temp / 100;
				temp = temp - (h*100);
			}
			if(temp >= 50) {
				fif = temp / 50;
				temp = temp - (fif*50);
			}
			if(temp >= 10) {
				ten = temp / 10;
				temp = temp - (ten*10);
			}
			System.out.println("#" + i);
			System.out.println(ftt + " " + tt + " " + ft + " " + t + " " + fh + " " + h + " " + fif + " " + ten);
		}
		sc.close();
	}
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int[] a = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int test = Integer.parseInt(br.readLine());
         
        for (int testCase = 1; testCase <= test; testCase++) {
            int k = Integer.parseInt(br.readLine());
            int cnt = 0;
             
 
            System.out.println("#" + testCase + " ");
             
            for (int i = 0; i < a.length; i++) {
                if(a[i] <= k) {
                    cnt = k/a[i];
                    k = k % a[i];
                    System.out.print(cnt + " ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
} 
 */
