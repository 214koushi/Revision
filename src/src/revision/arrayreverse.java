package src.revision;

public class arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'a','b','c','d'};
		/*for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}*/
		for (int i = ch.length-1; i>=0; i--) {
			System.out.print(ch[i]+ " ");
		}

	}

}
