package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

FileOutputStream fout=new FileOutputStream("D:\\Filehandling\\new.txt");
Scanner sc=new Scanner(System.in);
char c = sc.next().charAt(0);
fout.write(c);
fout.close();
	}

}
