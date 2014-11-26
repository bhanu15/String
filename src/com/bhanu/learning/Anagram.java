package com.bhanu.learning;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		String str = "Hello World";
		String str1 = "Hello World";
		char[] chArray = str.toCharArray();
		char[] chArray1 = str1.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : chArray) {
			if (map.containsKey(c)) {

				int size = map.get(c) + 1;
				map.put(c, size);

			} else {
				map.put(c, 1);
			}

		}

		for (char c : chArray1) {

			if (map.containsKey(c)) {

				int size = map.get(c) - 1;
				if (size == 0) {
					map.remove(c);
				} else {
					map.put(c, size);
				}

			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);
		if (map.isEmpty() == true){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}
