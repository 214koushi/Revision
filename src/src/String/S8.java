package src.String;

public class S8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     //palindrome
		String s="mom";
		String org=s;

		String rev=" ";
			for (int i = s.length()-1; i >=0; i--) {
				rev=s.charAt(i)+rev;
			}
			System.out.println(rev);
if (org.equals(rev)) {
	System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}
	}

}
