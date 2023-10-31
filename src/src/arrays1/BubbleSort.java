package src.arrays1;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,40,30,20,35,18};
for (int i = 0; i < a.length-1; i++) {
	for (int j = 0; j < a.length-i-1; j++) {
		if (a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
	}
System.out.println("----------------------------------------------------------------------------");


int b[]= {15,4,35,12,5,81};
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if (b[i]>b[j]) {
			int temp=b[i];
			b[i]=b[j];
			b[j]=temp;

		}
	}
	System.out.println(b[i]);
}
	}
	}
	
	
