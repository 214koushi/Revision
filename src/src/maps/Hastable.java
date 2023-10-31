package maps;

import java.util.Hashtable;

public class Hastable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable hs=new Hashtable<>();
hs.put(222, "idly");
hs.put(223, "dosa");
hs.put(221, "poori");
hs.put(224, "puliyogre");
System.out.println(hs);
System.out.println(hs.contains("puliyogre"));
System.out.println(hs.containsKey(222));
System.out.println(hs.get(221));
System.out.println(hs.keySet());
System.out.println(hs.entrySet());
System.out.println(hs.size());
System.out.println(hs.isEmpty());
System.out.println(hs.remove(224));
hs.clear();
System.out.println(hs.equals(hs));
System.out.println(hs.values());




	}

}
