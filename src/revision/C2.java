package revision;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// upcasting
		A obj=new A();
		System.out.println(obj.a);// we cant acces the superclass members with subclass
		//System.out.println(obj.b);
		B obj1=(B) obj;// downcasting
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}

}
class A{
	int a=10;
}
class B extends A{
	int b=20;
}
