package src.String;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=55452;
String s=String.valueOf(num);
StringBuffer s1=new StringBuffer(s).reverse();
String a=new String(s1);
int b=Integer.parseInt(a);
System.out.println(b);

	}

}
