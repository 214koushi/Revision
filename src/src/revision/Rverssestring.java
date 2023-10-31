package src.revision;

public class Rverssestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="jack";
String rev=" ";
for (int i = 0; i < s.length(); i++) {
	rev=s.charAt(i)+rev;
}
System.out.println(rev);
	}

}
