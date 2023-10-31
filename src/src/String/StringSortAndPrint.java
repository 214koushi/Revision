package src.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSortAndPrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = s.nextLine();

        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);

        Set<Character> hs = new LinkedHashSet<>();
        for (char c : charArray) {
            hs.add(c);
        }

        System.out.println("Sorted string: " + new String(charArray));
        System.out.print("Characters without repeating: ");
        for (char c : hs) {
            System.out.print(c);
        }
    }
}
