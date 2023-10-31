package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Object> hs=new HashSet<>();
hs.add(10);
hs.add("hai");// hs allows all the type elements
hs.add('A');
hs.add('0');

System.out.println(hs);
ArrayList<Object>ls=new ArrayList<>(hs);// conversion of one type collection to another type with parameterized constructor
System.out.println(ls);
//TreeSet<Object>ts=new TreeSet<>(ls);
//System.out.println(ts);// exception occured bcz elements are not comparable type

	}

}
