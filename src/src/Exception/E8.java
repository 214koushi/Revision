package Exception;

public class E8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
dinga();
System.out.println("ends");
	}
private static void dinga() {
		// TODO Auto-generated method stub
		System.out.println("hai");
		dingi();
		System.out.println("bye");
	}
private static void dingi() {
		// TODO Auto-generated private static void dingi() {
		// TODO method stub
		System.out.println("hayyyy");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		System.out.println("bayyyyyyyyyyy");

	}

}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at Exception.E8.dingi(E8.java:23)
at Exception.E8.dinga(E8.java:14)
at Exception.E8.main(E8.java:8)*/
// objectPropogationException