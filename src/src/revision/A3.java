package src.revision;

public class A3 {

	public static void main(String[] args) {
		String s="koushik";
		char[] ch = s.toCharArray();
		String rev="";
		for (int i = ch.length-1; i>=0; i--) {
			rev=rev+ch[i];
		}
System.out.println(rev);


	}

}
