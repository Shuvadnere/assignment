package pack;
import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s1,s2,s3,s4,s5;
		
		float avg;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of subject 1");
		s1=sc.nextInt();
		
		System.out.println("Enter marks of subject 2");
		s2=sc.nextInt();
		
		System.out.println("Enter marks of subject 3");
		s3=sc.nextInt();
		
		System.out.println("Enter marks of subject 4");
		s4=sc.nextInt();
		
		System.out.println("Enter marks of subject 5");
		s5=sc.nextInt();
		
		avg=(s1+s2+s3+s4+s5)/5f;
		
	if(avg<40)
		System.out.println("Fail");
	
	else if(avg>=40 && avg<=60)
		System.out.println("C grade");
	
	else if(avg>60 && avg<=80)
		System.out.println("B grade");
	
	else
		System.out.println("A grade");
		
	
	}

}
