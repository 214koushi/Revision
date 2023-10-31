package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class F8 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
FileInputStream fit= new FileInputStream("D:\\Filehandling\\new2.txt");
ObjectInputStream oit=new ObjectInputStream(fit);
System.out.println(oit.available());
Truck t=(Truck) oit.readObject();// deserialization
System.out.println(t);
	}

}
