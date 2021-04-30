package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class algo_2817_better {
	static int n,k;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=tc;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++)
                arr[j] = Integer.parseInt(st.nextToken());
            result = 0;
            solve(0,0);
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.println(sb);
    }
    
    static int result;
    private static void solve(int idx,int sum) {
        if(sum==k) {
            result++;
            return;
        }
        if(sum>k || idx>=n) return;
        // �ڱ� �ڽ��� ����
        solve(idx+1,sum+arr[idx]);
        // �ڱ� �ڽ��� ������
        solve(idx+1,sum);
    }
}
