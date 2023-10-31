package src.revision;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234;
int temp=num;
int otemp=temp;
int count=0;
int sum=0;
while (num>0) {
	num=num/10;
	count++;
}
while (temp>0) {
	int rem=temp%10;
	int i=count;
	int res=1;
	while (i>0) {
		res=rem*res;
	}
	sum=sum+res;
	temp=temp/10;
}
if (otemp==sum) {
	System.out.println("armstrong");

}
else {
	System.out.println("not armstrong");
}

	}

}
