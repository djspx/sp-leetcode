package com.sergioparracho.sp_leetcode.solution205;

// Best yet
public class Solution7 {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
		System.out.println(isIsomorphic("badc", "baba"));

	}

	public static boolean isIsomorphic(String s, String t) {
		int[] map = new int[128];
		int[] book = new int[128];
		for (int i = 0; i < s.length(); i++) {
			int cs = (int) s.charAt(i);
			int ts = (int) t.charAt(i);
			if (map[cs] == 0 && book[ts] == 0) {
				map[cs] = ts;
				book[ts] = 1;
			} else if (map[cs] != ts)
				return false;
		}
		return true;
	}
}
