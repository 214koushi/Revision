package maps;

import java.util.HashMap;

public class HashmapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hs=new HashMap();
hs.put(101,"dosa");
hs.put(102, "idly");
System.out.println(hs.size());
System.out.println(hs);
HashMap hs1=new HashMap();
hs1.put(9845, "hai");
hs1.put(8945, "bye");
System.out.println(hs1.size());
System.out.println(hs1);
hs.putAll(hs1);
System.out.println(hs);
System.out.println(hs.containsKey(102));
System.out.println(hs.containsValue("hai"));
hs.remove(101);
System.out.println(hs);
System.out.println(hs.get(9845));
System.out.println(hs.isEmpty());
System.out.println(hs.values());


	}

}
