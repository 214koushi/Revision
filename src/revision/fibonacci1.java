package revision;

public class fibonacci1 {
	public static void  fibonacci(int a,int b,int sum)
	{
		if (a==0 && b==1) {
			System.out.println(a);
			System.out.println(b);
		}
		if (sum==25) {
			return;
		}
		sum=a+b;
		System.out.println(sum);
		a=b;
		b=sum;
		fibonacci(a,b,sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// without using loops, by using recurssion
		System.out.println(0);
		System.out.println(1);
		fibonacci(0,1,0);
	}

}
