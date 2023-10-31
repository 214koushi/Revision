package src.String;

public class Sb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StringBuilder sb=new StringBuilder("hello");      //NON IMMUTABLE
StringBuilder sb1=new StringBuilder("haibye");
sb.append(sb1);
System.out.println(sb);*/
		String s=new String("jaisriRam");       // IMMUTABLE
		String s1=new String("ramSita");
		s.concat(s1);
		System.out.println(s);
		                  /* StringBuffer sf=new StringBuffer("nanehero");
		                   StringBuffer sf1=new StringBuffer("nineheroine"); //NON IMMUTABLE
		                   sf.append(sf1);
		                   System.out.println(sf);*/

	}

}
