package oops;

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C w=new C();
w.smoke();
w.drink();
	}

}
interface I1{
	void smoke();
}
interface I2{
	void drink();
}
class C implements I1, I2{
	@Override
	public void smoke() {
		System.out.println("i dont smoke");
	}
	@Override
	public void drink() {
		System.out.println("i dont drink");
	}


	}