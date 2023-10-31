package src.String;

import java.util.HashSet;
import java.util.Set;

public class OccStr {
public static void main(String[] args) {
	String s="loveuzindagi";
	char[] ch = s.toCharArray();
	Set<Character>hs=new HashSet<>();
	for(char addwd:ch) {
		hs.add(addwd);
	}
	for(Character addocc:hs) {
		int count=0;
		for(char addwd:ch) {
			if (addwd==addocc) {
				count++;
			}
		}
		System.out.println(addocc+" : "+count);
	}
}}

