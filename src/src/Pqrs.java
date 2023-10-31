
public class Pqrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234;
int temp=num;
int sum=0;
while(num>0) {
	int rem = num%10;
	int fact=1;
while (rem>0) {
	fact=fact*rem--;
}
sum=sum+fact;
num=num/10;


}
if (sum==temp) {
	System.out.println(sum+"  is a strong number");
}
}
	}


