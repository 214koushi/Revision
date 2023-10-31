package src.revision;

public class NumberPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=121;
int org=num;
int temp=org;
 int rev=0;
while(num>0) {
	int rem=num%10;
	rev=rev*10+rem;
	num=num/10;
}

if (rev==temp) {
	System.out.println("palindrome");
}

	}

}
