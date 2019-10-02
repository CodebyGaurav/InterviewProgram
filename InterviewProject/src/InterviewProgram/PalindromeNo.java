package InterviewProgram;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12221;
		
		int temp = i;
		int sum=0;
		while(i>0)
		{
			int rem = i%10;
			sum = (sum*10)+rem;
			i = i/10;
			
		}
		if(temp==sum)
		System.out.println("Palindrome : "+sum);
		else
			System.out.println("Not Palindrome");
	}

}
