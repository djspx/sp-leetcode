package com.sergioparracho.sp_leetcode.solution205;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
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
		Map<Character, Boolean> mappedBefore = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			Character sc = s.charAt(i);
			Character tc = t.charAt(i);
			if (map.containsKey(sc)) {
				if (!(map.get(sc).equals(tc))) {

					return false;
				}
			}
			else
			{
				if (mappedBefore.containsKey(tc))
				{
					return false;
				}
			}
			map.put(sc, tc);
			mappedBefore.put(tc, true);
		}

		return true;
	}
}