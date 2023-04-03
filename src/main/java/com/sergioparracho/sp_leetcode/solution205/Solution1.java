package com.sergioparracho.sp_leetcode.solution205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1 {
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

		Map<Character, Character> map = new HashMap<>();
		Set<Character> mappedBefore = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (!(map.get(s.charAt(i)).equals(t.charAt(i)))) {

					return false;
				}
			}
			else
			{
				if (mappedBefore.contains(t.charAt(i)))
				{
					return false;
				}
			}
			map.put(s.charAt(i), t.charAt(i));
			mappedBefore.add(t.charAt(i));
		}

		return true;
	}
}
