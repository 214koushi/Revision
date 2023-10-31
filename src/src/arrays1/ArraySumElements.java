package arrays1;

import java.util.Scanner;

public class ArraySumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
System.out.println("enter the size of array");
int size=s.nextInt();
int[] a=new int[size];
for (int i = 0; i < a.length; i++) {
	a[i]=s.nextInt();
}
int sum=0;
for (int element : a) {
	sum+=element;

}
System.out.println(sum);
	}

}
