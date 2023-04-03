package com.sergioparracho.sp_leetcode.solution205;

import java.util.Set;
import java.util.TreeSet;

// Best runtime so far
public class Solution4 {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
		System.out.println(isIsomorphic("badc", "baba"));

	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		if (s == null || s.length() == 0 || t == null || t.length() == 0) {
			return false;
		}

		Integer[] map = new Integer[256];
		Set<Integer> mappedBefore = new TreeSet<>();

		for (int i = 0; i < s.length(); i++) {
			int sc = (int) s.charAt(i);
			int tc = (int) t.charAt(i);
			if (map[sc] != null) {
				if (map[sc] != tc) {
					return false;
				} 
			}
			else if (mappedBefore.contains(tc)) {
				return false;
			}
			map[sc] = tc;
			mappedBefore.add(tc);
		}

		return true;
	}
}
