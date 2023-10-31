package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class F2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fout =new FileOutputStream("D:\\Filehandling\\new1.txt");
String s="foriegn";
byte[] n = s.getBytes();
fout.write(n);
fout.close();
	}

}
