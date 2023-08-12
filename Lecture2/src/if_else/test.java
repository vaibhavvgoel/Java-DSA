package if_else;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int i = 2;
		
		while (n%2==0&&i<=n) {
			sum = i + sum;
			i = i + 2;
		}
		System.out.println(sum);
	}

}
