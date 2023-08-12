package if_else;

import java.util.Scanner;


public class table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i = 1;
		int x;
		
		while (i<=10)
		{
			x = n*i;
			i = i+1;

			System.out.print(x);
			
	}

}
}