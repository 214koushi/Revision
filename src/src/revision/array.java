package src.revision;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("enter the size of array");
		int size=s.nextInt();
		int [] a=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}
		System.out.println(a);


	}

}
