package src.revision;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}