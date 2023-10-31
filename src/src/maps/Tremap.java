package maps;

import java.util.TreeMap;

public class Tremap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap t=new TreeMap<>();
t.put(111,"aramagi");
t.put(112,"kuthiru");
t.put(115, "maharaniya hageee");
t.put(113,"ninu");
t.put(110, "ahaa");
t.put(114, "rani hagee");
System.out.println(t.firstEntry());
System.out.println(t);

System.out.println(t.firstEntry());
System.out.println(t.containsKey(116));
System.out.println(t.containsValue("rani hagee"));
System.out.println(t.keySet());
System.out.println(t.entrySet());
System.out.println(t.get(113));
System.out.println(t.values());
System.out.println(t.remove(113));
System.out.println(t.firstKey());
System.out.println(t.firstEntry());
System.out.println(t.isEmpty());



	}

}
