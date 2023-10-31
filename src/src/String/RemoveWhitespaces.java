package src.String;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="k  o    u  s  h  i  k ";
String s1 =null;
for (int i = 0; i < s.length(); i++) {
	s1 = s.replace("  ", "");
}

//String [] s1=s.split(" ");
//for (int i = 0; i < s1.length; i++) {
//	System.out.print(s1[i]);
//}
System.out.println(s1);
	}

}
