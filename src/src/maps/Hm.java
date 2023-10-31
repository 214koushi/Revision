package maps;

import java.util.HashMap;

public class Hm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap<>();
hm.put(100,"hai");
hm.put(102, "hello");
hm.put(104, "hahaii");
hm.put(null, "ahaii");
System.out.println(hm);
HashMap hm1=new HashMap<>();
hm1.put(10,"hi");
hm1.put(12, "heo");
hm1.put(04, "haaii");
hm1.put(14, "adhii");
System.out.println(hm1);
boolean a = hm.containsKey(103);
System.out.println(a);
System.out.println(hm1.containsValue("adhii"));
hm.putAll(hm1);
System.out.println(hm);
System.out.println(hm.keySet());
System.out.println(hm1.entrySet());
System.out.println(hm1.isEmpty());
System.out.println(hm.remove(105));
System.out.println(hm.values());
System.out.println(hm.size());
System.out.println(hm.remove(hm1));



	}

}
