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
  void test1() {
    Assertions.assertTrue(Solution205.isIsomorphic("egg", "add"));
  }

  @Test
  void test2() {
    Assertions.assertFalse(Solution205.isIsomorphic("foo", "bar"));
  }

  @Test
  void test3() {
    Assertions.assertTrue(Solution205.isIsomorphic("paper", "title"));
  }

  @Test
  void test4() {
    Assertions.assertFalse(Solution205.isIsomorphic("bbbaaaba", "aaabbbba"));
  }

  @Test
  void test5() {
    Assertions.assertFalse(Solution205.isIsomorphic("badc", "baba"));
  }

  @Test
  void test6() {
    Assertions.assertFalse(Solution205.isIsomorphic("baddc", "babga"));
  }
}
