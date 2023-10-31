package Encapsulation;

public class E1 {
private double price;
String colo;
int now;
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price=price;

}
E1(){}
E1(double price,String colo,int now){
	this.price=price;
	this .colo=colo;
	this.now=now;
}
@Override
public String toString() {
	return "E1 [price=" + price + ", colo=" + colo + ", now=" + now + "]";
}
}


