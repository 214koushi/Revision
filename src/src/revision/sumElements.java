package src.revision;

import java.util.Scanner;

public class sumElements {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size =s.nextInt();
	double[] d=new double[size];
    System.out.println("enter the values");
    for (int i = 0; i < d.length; i++) {
    	 d[i] =s.nextDouble();

	}
       double sum=0;
       for (double element : d) {
		sum=sum+element;
	}
	System.out.println(sum+ " is the sum of values ");
}
}
