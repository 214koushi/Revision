package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class F4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fint =new FileInputStream("D:\\\\Filehandling\\\\new1.txt");

 fint.available();

int r = fint.read();
System.out.println((char)r);
fint.close();
	}

}
