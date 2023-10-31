
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,1,7,8,4,59};
		for (int i = 0; i < a.length; i++) {
			int j=2;
			int count=0;
			while (j<a[i]/2) {
				if (a[i]%2==0) {
					count++;
					break;
				}
				j++;
			}
			if (count==0) {
				System.out.println(a[i]);
			}
		}




		}
}



