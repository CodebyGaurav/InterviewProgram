package InterviewProgram;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in); 
		System.out.println("ENter the number : ");

		int i = s.nextInt();
		int temp=i;
		
		int c=0;
		while(i>0)
		{
			int rem = i%10;
			i = i/10;
			c= c+(rem*rem*rem);
		}
		if(temp==c) {

			System.out.print("Armstrong Number : "+c);	
		}else
		{

			System.out.print("Armstrong Number NOt..: ");
		}
	}

}
