package src.revision;

import java.util.Scanner;

public class basic2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
int size=s.nextInt();
String st []=new String[size];
System.out.println("enter your friends name");
for (int i = 0; i < st.length; i++) {
	st[i]=s.nextLine();
}
for (int i = 0; i < st.length; i++) {
	System.out.println(st[i]);
}
	}

}
