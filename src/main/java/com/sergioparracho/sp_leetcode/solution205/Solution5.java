package com.sergioparracho.sp_leetcode.solution205;

/**
 * @author Sergio Parracho 
 * GitHub: https://github.com/djspx 
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

import java.util.HashMap;
import java.util.Map;

public class Solution5 {
	public boolean isIsomorphic(String s, String t) {
		Map<Character, Integer> charToIndex_s = new HashMap<>();
		Map<Character, Integer> charToIndex_t = new HashMap<>();

		for (Integer i = 0; i < s.length(); ++i)
			if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i))
				return false;

		return true;
	}
}
