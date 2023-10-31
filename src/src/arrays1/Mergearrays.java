package arrays1;

import java.util.Scanner;

public class Mergearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=toRead();
		int[]b=toRead();
		int[]res= toMerge(a,b);
		display(res);


	}
	public static int[] toRead()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();

		int[]a=new int[size];
		System.out.println("enter the elements");
		for (int i =0; i <a.length; i++)
		{
			a[i]=s.nextInt();
	}
		return a;
	}
	public static int[] display(int[]a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		return a;
		}
 public static int[] toMerge(int[]a,int[]b) {
int c[]=new int[a.length+b.length];
for (int i = 0; i < c.length; i++) {
	c[i]=a[i];
}
for (int i = 0; i < c.length; i++) {
	c[a.length+i]=b[i];
}
	return c;

}
}
