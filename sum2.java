package pack;
import java.util.Scanner;

public class sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,sum;
		
		Scanner sc= new Scanner(System.in);
	
		
		System.out.println("Enter first number");
			a=sc.nextInt();
			
		System.out.println("Enter first number");
			b=sc.nextInt();
			
			sum=a+b;
			
		System.out.println("Sum of both numbers is "+sum);
		
		if(sum>100)
			System.out.println("Welcome");
		else
			System.out.println("Sorry");
			

	}

}
