package if_else;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a<0 && b>0)
		{
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}

	}

}
