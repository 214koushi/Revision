package Exception;

public class E3 {
public static void main(String[] args) {
	int[] a=new int[8];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=60;
	a[5]=50;
	a[6]=70;
	a[7]=80;
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println(a[10]);// ArrayIndexOutOfBoundException

}
}
