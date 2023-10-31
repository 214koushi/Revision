package Exception;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=10;
	char b='a';
	System.out.println(a/b);//arithmetic exception
} catch (ArithmeticException e) {
	// TODO: handle exception
	System.out.println("enter the integer value greater than zero(0)");
}
	catch (Exception e2) {
		// TODO: handle exception
		System.out.println("enter integer value");
	}
finally {
	System.out.println("resolved.......!!!!!!");
}

}
	}


