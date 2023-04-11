package com.sergioparracho.sp_leetcode.solution205;

/**
 * @author Sergio Parracho 
 * GitHub: https://github.com/djspx 
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

import java.util.Map;
import java.util.TreeMap;

public class Solution205b {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
		System.out.println(isIsomorphic("badc", "baba"));

	}

	public static boolean isIsomorphic(String s, String t) {
		if (s == null || t == null) {
			return false;
		}
		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> map = new TreeMap<>();
		Map<Character, Boolean> mappedBefore = new TreeMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (!(map.get(s.charAt(i)).equals(t.charAt(i)))) {

					return false;
				}
			} else {
				if (mappedBefore.containsKey(t.charAt(i))) {
					return false;
				}
			}
			map.put(s.charAt(i), t.charAt(i));
			mappedBefore.put(t.charAt(i), true);
		}

		return true;
	}
}
