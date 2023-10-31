package src.String;

public class SwapwithoutExtraVariable {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1="koushik";
		String s2="karthik";
		s1=s1+" "+s2;
		s2=s2+" "+s1;
		s1=s1.split(" ")[1];
		s2=s2.split(" ")[1];
		System.out.println(s1);
		System.out.println(s2);


	}
}
