package Exception;

import java.util.ArrayList;

public class E6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ls=new ArrayList<>();
ls.add(1);
ls.add(20);
ls.add('a');
ls.add("hai");
System.out.println(ls);
ls.remove(20);//IndexOutOfBoundException
ls.remove(Character.valueOf('a'));
ls.remove(Integer.valueOf(20));
ls.remove(String.valueOf("hai"));
System.out.println(ls);


	}

}
