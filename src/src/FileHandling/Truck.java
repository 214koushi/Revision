package FileHandling;

import java.io.Serializable;

public class Truck implements Serializable {
String colo;
int now;
double price;
Truck()
{}
Truck(String colo ,int now ,double price){
	this.colo=colo;
	this.now=now;
	this.price=price;
}

@Override
public String toString() {
	return "Truck [colo=" + colo + ", now=" + now + ", price=" + price + "]";
}

}
