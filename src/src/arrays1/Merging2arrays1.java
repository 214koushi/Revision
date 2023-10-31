package src.arrays1;

import java.util.Scanner;

public class Merging2arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size of 1st array");
int n1=s.nextInt();
System.out.println("enter the size of 2nd array");
int n2=s.nextInt();
int A[]=new int[n1];
int B[]=new int [n2];
int n3=n1+n2;
int C[]= new int[n3];
System.out.println("enter the A elemnts");
for (int i = 0; i < A.length; i++) {
	A[i]=s.nextInt();
}
System.out.println("enter the B elemnts");
for (int i = 0; i < B.length; i++) {
	B[i]=s.nextInt();
}
for (int i = 0; i <n1; i++) {
	C[i]=A[i];

}
for (int i = 0; i < n2; i++) {
	C[n1+i]=B[i];
}
System.out.println("merged arrays :");
for (int i = 0; i < C.length; i++) {
	System.out.println(C[i]);
}
	}
}
