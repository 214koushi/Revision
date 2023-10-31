package Exception;

import java.util.TreeSet;

public class E7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts=new TreeSet<>();
ts.add(10);
ts.add(20);
ts.add('a');// ClassCastException// bcz added elements should be comparable type
System.out.println(ts);
	}

}
