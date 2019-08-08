package algo_D3;

import java.util.Scanner;

public class algo_4751 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1; i<=test ; i++) {
			sc.nextLine();
			String word = sc.nextLine();
			int si = word.length();
			
			String first, second, third;
			first = "..#..";
			second = ".#.#.";
			third = "#." + word.charAt(0) + ".#";
			
			if(si > 1) {
				for(int j=1 ; j<si ; j++) {
					first += ".#..";
					second += "#.#.";
					third += "." + word.charAt(j) + ".#";
				}
			}
			System.out.printf("%s\n%s\n%s\n%s\n%s", first, second, third, second, first);
		}
		sc.close();
	}
}
