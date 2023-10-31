package src.String;

public class S3 {

	public static void main(String[] args) { // conversion of char [] into string
		// TODO Auto-generated method stub
		char ch[]= {'A','P','P','L','E'};
		/*String s=new String(ch);   //using  parameterised constructor
		System.out.println(s);*/


		/*String s=String.valueOf(ch);// using String.valueof() method
		System.out.println(s);*/


		String s=" ";
		for (char element : ch) {// without using built ins
			s=s+element;

		}
		System.out.println(s);
	}

}
