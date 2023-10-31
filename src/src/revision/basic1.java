package src.revision;

import java.util.Scanner;

public class basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int size=s.nextInt();
char ch[]=new char[size];
System.out.println("enter the characters");
for (int i = 0; i < ch.length; i++) {
	ch[i]=s.next().charAt(0);

}
for (int i = 0; i < ch.length; i++) {
	System.out.println(ch[i]);
}
	}

}
