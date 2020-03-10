package algo0624;

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
 
