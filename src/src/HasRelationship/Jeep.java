package HasRelationship;

public class Jeep {
double price;
Radium r;
void drive() {
System.out.println("driving slowly");
r=new Radium();
}
}
// late binding
class Radium {
	String colour;
	void paste() {
		System.out.println("automatically or by gum");
	}
}

