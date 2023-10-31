package src.String;

public class S10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is koushik";
		String[] ch = s.split(" ");
		for (int i =ch.length-1; i >=0; i--) {
			System.out.print(ch[i]+" ");
		}

	}

}
