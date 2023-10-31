package arrays1;

import java.util.Arrays;

public class sorting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'a','c','b','d'};
		System.out.println("before sorting");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			}
		Arrays.sort(ch);
		System.out.println("after sorting");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			}

	}

}
