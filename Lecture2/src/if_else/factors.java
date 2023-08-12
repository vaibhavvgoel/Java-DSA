
package if_else;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int f=2;
		
		while (f<n) {
			if (n%f==0)
			System.out.print(f+" ");
			f = f+1;
}}
}
