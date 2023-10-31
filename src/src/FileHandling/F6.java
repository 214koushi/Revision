package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class F6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fint =new FileInputStream("D:\\\\Filehandling\\\\new1.txt");
		System.out.println(fint.available());
		int data = fint.read();
		while(data!=-1)
		{
		System.out.print((char)data);
		data=fint.read();
		}

	}

}
