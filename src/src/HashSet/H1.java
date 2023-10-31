package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Object> hs=new HashSet<>();
hs.add(10);
hs.add(20);
hs.add(30);
hs.add(10);
hs.add(14);

System.out.println(hs);
Iterator i=hs.iterator();// accessing with the help of
while (i.hasNext()) {
	System.out.println(i.next());
}
	}

}
