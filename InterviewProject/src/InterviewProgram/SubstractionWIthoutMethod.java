package InterviewProgram;

import java.util.Scanner;

public class SubstractionWIthoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two value a & b : ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		while(b>0)
		{
			b--;
			a--;
		
		}
		System.out.println(a);
				
	}

}
