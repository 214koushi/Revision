package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class F3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout =new FileOutputStream("D:\\Filehandling\\new1.txt");
		String s="foriegn";
		for (int i = 0; i < s.length(); i++) {
			char s1 = s.charAt(i);
			fout.write(s1);
		}
		fout.close();

	}

}
