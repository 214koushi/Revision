package src.String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="for  1   get";
		/*StringBuffer s1=new StringBuffer(s);
		StringBuffer a = s1.reverse();
		System.out.println(a);
		String s2=new String(s1);
		System.out.println(s2);*/
		
		String[] s3 = s.split(" ");
		//char[] ch = s.toCharArray();
		for (int i =0; i <s3.length; i++) {
			
			String c = s3[i];
			char[] ch = c.toCharArray();
			for (int j = ch.length-1; j >=0; j--) {
				 char str = ch[j];
				System.out.print(str);
			}
			System.out.print(" ");
		}
	}

}
