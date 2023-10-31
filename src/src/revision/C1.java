package src.revision;

public class C1 {
 C1() {
	System.out.print("my ");
}
C1(int a) {
	this();
	System.out.print("name ");
}
 C1(int a,int b) {
	this(10);
	System.out.print("is ");
}
C1(int a ,int b, int c)
{
	this(10,20);
	System.out.print("koushik ");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C1 c=new C1(10,20,30);


	}

}

