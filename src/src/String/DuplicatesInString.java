package src.String;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="KOushiii";
char ch[]=str.toCharArray();
StringBuilder sb=new StringBuilder();

for (int i = 0; i < ch.length; i++) {
	boolean rep=false;
	for (int j = i+1; j < ch.length; j++) {
		if (ch[i]==ch[j]) {
			rep=true;
			break;
	}
}
	if (!rep) {
		sb.append(ch[i]);
	}
}
System.out.println(sb);


// ap-2
StringBuilder sb1=new StringBuilder();
Set<Character>hs=new HashSet<>();
for (int i = 0; i < ch.length; i++) {
	hs.add(str.charAt(i));
}
for(Character c:hs) {
	sb1.append(c);
}
System.out.println(sb1);
	}

}
