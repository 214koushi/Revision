package Exception;

public class E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
System.out.println(a.i);
A a1=new B();
System.out.println(a1.i);

B b=(B) a;
System.out.println(b.i);
System.out.println(b.j);// ClassCastException
	}

}
class A
{
	int i=10;

	}
class B extends A{
	int j=20;

}