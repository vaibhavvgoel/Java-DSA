import java.util.Scanner;
public class AvgMarks {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		
		System.out.println(name);
		System.out.println((i+j+k)/3);
	}

}
