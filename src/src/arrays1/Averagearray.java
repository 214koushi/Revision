package arrays1;

import java.util.Scanner;

public class Averagearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number of products");
int n=s.nextInt();
double[] d=new double[n];
for (int i = 0; i < d.length; i++) {
	d[i]=s.nextDouble();
}
double sum=0;
for (double element : d) {
	sum+=element;
}
double avg=sum/n;
System.out.println(avg);
	}

}
