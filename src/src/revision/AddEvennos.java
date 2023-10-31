package src.revision;

import java.util.Scanner;

public class AddEvennos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the  1st even number");
int a1=s.nextInt();
System.out.println("enter the  2nd even number");
int a2= s.nextInt();

if (a1%2!=0&&a2%2!=0) {
	System.out.println("bubyeee");
}
else if (a1<0||a2<0) {
	System.out.println("bye bye");
}
else {
	int c = a1+a2;
	System.out.println(c);
}


}
}