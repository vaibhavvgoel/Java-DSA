import java.util.Scanner;

public class CalcSI {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p = scan.nextInt();
		int t = scan.nextInt();
		int r = scan.nextInt();
		
		int SI = (p*r*t)/100;
		
		System.out.println(SI);
	}
}
