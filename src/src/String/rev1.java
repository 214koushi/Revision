package src.String;

public class rev1 {

	public static void main(String[] args) {
		String s="koushik";
//		String[] s1 = s.split("");
//		for (int i = s1.length-1; i >=0; i--) {
//			System.out.println(s1[i]);
//		}
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.substring(sb.length()-1, 1));
		String s2="";
		
		
		for (int i = 0; i < s.length(); i++) {
			String a = s.substring(i, i+1);
			
			s2=a+s2;
		}
		
		
		 System.out.println(s2);
	}
}
