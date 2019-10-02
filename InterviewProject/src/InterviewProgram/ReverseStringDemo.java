package InterviewProgram;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =  "Gaurav Sharma";
		
		int i = str.length();
		while(i>0)
		{
			System.out.print(str.charAt(i-1));
			i--;	
		}
		
	}

}
