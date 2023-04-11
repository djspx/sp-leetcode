package com.sergioparracho.sp_leetcode.solution205;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sergioparracho.sp_leetcode.Solution205;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */
public class Solution205aTest {
  @Test
  void test1() {
    Assertions.assertTrue(Solution205a.isIsomorphic("egg", "add"));
  }

  @Test
  void test2() {
    Assertions.assertFalse(Solution205a.isIsomorphic("foo", "bar"));
  }

  @Test
  void test3() {
    Assertions.assertTrue(Solution205a.isIsomorphic("paper", "title"));
  }

  @Test
  void test4() {
    Assertions.assertFalse(Solution205a.isIsomorphic("bbbaaaba", "aaabbbba"));
  }

  @Test
  void test5() {
    Assertions.assertFalse(Solution205a.isIsomorphic("badc", "baba"));
  }

  @Test
  void test6() {
    Assertions.assertFalse(Solution205a.isIsomorphic("baddc", "babga"));
  }
}
