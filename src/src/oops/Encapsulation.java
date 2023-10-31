package oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1=new Car("black",10000,4);
c1.getPrice();
c1.setPrice(200000);
System.out.println(c1.colour);
System.out.println(c1.now);
System.out.println(c1.getPrice());
	}

}
class Car
{
	String colour;
	private double price;
	int now;
	Car(){}
	Car(String colour ,double price ,int now){
		this.colour=colour;
		this.price=price;
		this.now=now;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [colour=" + colour + ", price=" + price + ", now=" + now + "]";
	}


}
