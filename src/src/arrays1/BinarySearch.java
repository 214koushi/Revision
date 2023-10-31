package arrays1;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,80,30,75,50};
		int key=10;
		Arrays.sort(a);
		int high=a.length-1;
		int low= 0;
		int count=0;
		int mid=(low+high)/2;
		while (low<=high) {
			if (key==a[mid]) {
				count++;
				break;
			}
			else if (key>a[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		if (count==1) {
			System.out.println(key+" is found");
		}
		else {
			System.out.println(key+"is not found");
		}

}}
