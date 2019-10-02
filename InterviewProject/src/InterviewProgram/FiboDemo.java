package InterviewProgram;

public class FiboDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n0=0;
		int n1=1;
		int n2;
		
		for(int x=1;x<=10;x++)
		{
			n2=n0+n1;
			System.out.print(" "+n2);
			n0=n1;
			n1=n2;
		}
	}

}
