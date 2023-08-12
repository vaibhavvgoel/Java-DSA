package if_else;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int i = 1;
		
		while (i<=n) {
			sum = i + sum;
			i = i + 1;
		}
		System.out.println(sum);
	}

}
