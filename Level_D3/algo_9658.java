import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algo_9658 {
	
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
         
        for (int i = 1; i <= test; i++) {
            String numSt = br.readLine();
            long numIndex = numSt.length() - 1;
            
            int firNum = Character.getNumericValue(numSt.charAt(0));
            int secNum = Character.getNumericValue(numSt.charAt(1));
            int thiNum = Character.getNumericValue(numSt.charAt(2));
            
            if(thiNum >= 5) {
            	secNum++;
            	if(secNum > 9) {
            		firNum++;
            		secNum = 0;
            		if(firNum > 9) {
            			firNum = 1;
            			numIndex++;
            		}
            	}
            }
            System.out.println("#" + i + " " + firNum + "." + secNum + "*10^" + numIndex);
        }
    }

}
