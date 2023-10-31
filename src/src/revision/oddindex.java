package src.revision;

import java.util.Scanner;

public class oddindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		String[] s1=new String[size];
		System.out.println("enter the city names");
		for (int i = 0; i < s1.length; i++) {
			s1[i]=s.nextLine();
		}

     for (int i = 0; i < s1.length; i++) {
		System.out.println(s1[i]);
	}
     System.out.println("odd indexes  ***************************");
     for (int i = 0; i < s1.length; i++) {
		if (i%2==1) {
			System.out.print(s1[i]+ " ");
		}
	}
	}

}
