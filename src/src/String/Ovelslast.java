package src.String;

public class Ovelslast {
    public static void main(String[] args) {
        String s = "Malayalam";
       char[] ch = s.toCharArray();
       String s1="";
       String s2="";
       for (char element : ch) {
		if (element=='a'||element=='e'||element=='i'||element=='o'||element=='u'||element=='A'||element=='E'||element=='I'||element=='O'||element=='U') {
			s1=s1+element;
		}
		else {
			s2=s2+element;
		}
	}


       s1=s2+s1;
       System.out.println(s1);
    }}
