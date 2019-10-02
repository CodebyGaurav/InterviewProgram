package InterviewProgram;

import java.util.*;

public class SumWithoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two value a & b : ");
		int a = s.nextInt();
		int b = s.nextInt();
		while(a>0)
		{
			b++;
			a--;			
		}
		
		System.out.println("B is :"+b);

	}

}
