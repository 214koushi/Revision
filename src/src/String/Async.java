package src.String;

public class Async {

	public static void main(String[] args) {
        System.out.println("hi");   
        StringBuffer b= new  StringBuffer("hellllll");
        StringBuffer res = b.append("oooooo");
        System.out.println(res);
        StringBuffer res3 = b.append("iiiii");
      
        System.out.println(res3);
        System.out.println("Bye");
        System.out.println("hi");   
        StringBuilder b1= new  StringBuilder(1234567891);
        /*StringBuilder res1 = b1.append("oooooooooo");
        System.out.println(res1);
        System.out.println("Bye");
        StringBuilder abc = b1.append(1234567891);*/
     
        System.out.println( b1.capacity());
        b1.trimToSize();
       System.out.println( b1.capacity());
	}

}
