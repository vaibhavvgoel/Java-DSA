package if_else;

import java.util.Scanner;
import java.lang.Math;
public class totalSalary {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int basic=sc.nextInt();
        
        char grade=sc.next().charAt(0);
        
        int a= basic;
        int allow=1300;
        double hra=(0.2d*basic);
        double da=(0.5d*basic);
            if(grade=='A')
            {
                allow=1700;
            }else if(grade=='B')
            {
                allow=1500;
            }
        double pf=(0.11d*basic);
        double totalSalary=a+hra;
        totalSalary+=da;
        totalSalary+=allow;
        totalSalary-=pf;
       
        System.out.println(Math.round(totalSalary));
	}
}