package src.revision;

import java.util.ArrayList;

public class A1 {

	public static void main(String[] args) {
       ArrayList ls=new ArrayList();
       ls.add(10);
       ls.add(20);
       ls.add(30);
       System.out.println(ls);
       System.out.println(ls.size());
       ArrayList<String>ls1=new ArrayList<>();
       ls1.add("mine");
       ls1.add("muddu");
       ls1.add("zindagi");
       System.out.println(ls1);
       System.out.println(ls1.size());
       ls.addAll(ls1);
       System.out.println(ls);

	}

}
