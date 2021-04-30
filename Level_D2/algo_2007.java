package algo0624;

import java.util.Scanner;

class algo2007 {

	public static void main(String []args) {
	    Scanner sc = new Scanner(System.in);
	    int T;
                T=sc.nextInt();
  
        	    for(int test_case = 1; test_case <= T; test_case++) {           
                    String text = sc.next();
            
                    String textPattern = text;
                    String textTemp = "";
                    int i = 1;
                    int j = 1;
            
                    while(textPattern.equals(textTemp) != true && textTemp.length() < text.length()/2-1){
            	textPattern = text.substring(0, i+1);
            	j = i+1;
            	textTemp = text.substring(j, j+i+1);

                        i++;
                    }
            
                    System.out.println("#"+test_case+" "+i);
                }
            }
/*
Input
3       
KOREAKOREAKOREAKOREAKOREAKOREA
SAMSUNGSAMSUNGSAMSUNGSAMSUNGSA
GALAXYGALAXYGALAXYGALAXYGALAXY     
Output
#1 5
#2 7
#3 6
*/
}
