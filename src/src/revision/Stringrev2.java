package src.revision;

public class Stringrev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="all the best";
char ch[]=s1.toCharArray();
for (int i = ch.length-1; i >=0; i--) {
	int k=i;
	while (i>=0 && ch[i]!=' ') {
	i--;
	}
	int j=i+1;
	while (j<=k) {
		s1=s1+ch[j];
		j++;
	}
	if (i>=0) {
		s1=s1+ch[i];
		System.out.println(ch[i]);
	}
}

	}

}
