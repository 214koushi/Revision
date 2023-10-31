package arrays1;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {10,50,30,20,40};
System.out.println("arrays before sorting");
for (int i = 0; i < a.length; i++) {
System.out.println(a[i]);
}
Arrays.sort(a);
System.out.println("after sorting");
for (int i = 0; i < a.length; i++) {
System.out.println(a[i]);
}
	}

}
