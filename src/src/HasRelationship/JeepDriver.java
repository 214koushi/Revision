package HasRelationship;

public class JeepDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jeep j=new Jeep();
System.out.println(j.r);
System.out.println(j.price);
j.drive();
System.out.println(j.r);
System.out.println(j.r.colour);
j.r.paste();


	}

}
