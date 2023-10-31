package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class F7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fot=new FileOutputStream("D:\\Filehandling\\new2.txt");
ObjectOutputStream oot=new ObjectOutputStream(fot);
oot.writeObject(new Truck("yellow",6,100000));
System.out.println("written");//serialization
oot.close();
fot.close();
	}

}
