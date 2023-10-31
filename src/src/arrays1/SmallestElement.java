package arrays1;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		System.out.println("enter the elements");
		int [] a=new int[size];
		for (int i = 0; i <a.length; i++)
		{
			a[i]=s.nextInt();
		}
		//System.out.println(a);
			int small=a[0];
			for (int i = 1; i<a.length; i++) {
				if (a[i]<small) {
					small=a[i];
				}
			}
			System.out.println(small);


	}
}
