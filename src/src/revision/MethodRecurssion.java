package src.revision;

public class MethodRecurssion {
static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		forget(1);

	}

	public static void forget(int string) {

		// TODO Auto-generated method stub
		System.out.println(i);
		i++;
		if (i==6) {
			System.out.println(string);
			return ;

		}
		forget(i);
	}




}
