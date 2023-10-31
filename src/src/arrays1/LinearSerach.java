package arrays1;

public class LinearSerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,20,30,40,50};
int key=40;
int count=0;
for (int element : a) {
	if (key==element) {
		count++;
	}
}
if (count==1) {
	System.out.println(key+" is found");
}
else {
	System.out.println(key+"is not found");
}
	}

}
