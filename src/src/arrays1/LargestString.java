package arrays1;

import java.util.Scanner;

public class LargestString {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println("enter the size");
int size=s.nextInt();

String[]a=new String[size];
System.out.println("enter the elements");
for (int i =0; i <a.length; i++)
{
	a[i]=s.next();
}
String large=a[0];
for(int i =0;i<a.length;i++)
{
 if (a[i].length()>large.length()) {
	large=a[i];
}

}
System.out.println(large);
}

	}


