package com.sergioparracho.sp_leetcode.solution205;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */
class Solution205hTest {

  @Test
  void test1() {
    Assertions.assertTrue(Solution205h.isIsomorphic("egg", "add"));
  }

  @Test
  void test2() {
    Assertions.assertFalse(Solution205h.isIsomorphic("foo", "bar"));
  }

  @Test
  void test3() {
    Assertions.assertTrue(Solution205h.isIsomorphic("paper", "title"));
  }

  @Test
  void test4() {
    Assertions.assertFalse(Solution205h.isIsomorphic("bbbaaaba", "aaabbbba"));
  }

  @Test
  void test5() {
    Assertions.assertFalse(Solution205h.isIsomorphic("badc", "baba"));
  }

  @Test
  void test6() {
    Assertions.assertFalse(Solution205h.isIsomorphic("baddc", "babga"));
  }

}
