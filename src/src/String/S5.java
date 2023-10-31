package src.String;

public class S5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="HaiBye";
int upc=0;
int lwc=0;
for (int j = 0; j < s.length(); j++) {
	char ch = s.charAt(j);
	System.out.print(ch);

	if (ch>='A'&& ch<='Z') {
		upc++;
	}
	else if (ch>='a'&& ch<='z') {
		lwc++;
	}

}
System.out.println();
System.out.println(upc);
System.out.println(lwc);


	}

}
