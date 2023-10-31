package arrays1;

public class ArraySquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {0,1,2,3,4,5,6,7,8,9};
for (int i = 0; i < a.length; i++) {
	int res=0;
	int count=0;
	res=a[i]*a[i];
	for (int element : a) {
		if (element==res) {
			count++;
		}}
	if (count>0) {
		System.out.println(res);
	}
		}

}
	}


