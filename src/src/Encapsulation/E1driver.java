package Encapsulation;

public class E1driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
E1 e=new E1();
e.setPrice(20000);
System.out.println(e.getPrice());
System.out.println(e.colo);
e.colo="yellow";
System.out.println(e.colo);
E1 e2=new E1(30000,"red",4);
System.out.println(e2.colo);
System.out.println(e2.now);
System.out.println(e2.getPrice());
	}

}
