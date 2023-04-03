package com.sergioparracho.sp_leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */
class Solution205Test {

	@Test
	void test() {
		Assertions.assertTrue(Solution205.isIsomorphic("egg", "add"));
		Assertions.assertFalse(Solution205.isIsomorphic("foo", "bar"));
		Assertions.assertTrue(Solution205.isIsomorphic("paper", "title"));
		Assertions.assertFalse(Solution205.isIsomorphic("bbbaaaba", "aaabbbba"));
		Assertions.assertFalse(Solution205.isIsomorphic("badc", "baba"));
		Assertions.assertFalse(Solution205.isIsomorphic("baddc", "babga"));
	}

}
