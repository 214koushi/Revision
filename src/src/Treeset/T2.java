package src.Treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Object> ts=new TreeSet<>();
ts.add(10);
ts.add(1);
ts.add(15);
ts.add(123);
ts.add(35);
ts.add(50);
ts.add(18);
System.out.println(ts);
Iterator<Object> i = ts.iterator();

while (i.hasNext()) {
	System.out.println(i.next());
}


	}

}
