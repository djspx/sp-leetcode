package com.sergioparracho.sp_leetcode.solution205;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */
class Solution205dTest {

  @Test
  void test1() {
    Assertions.assertTrue(Solution205d.isIsomorphic("egg", "add"));
  }

  @Test
  void test2() {
    Assertions.assertFalse(Solution205d.isIsomorphic("foo", "bar"));
  }

  @Test
  void test3() {
    Assertions.assertTrue(Solution205d.isIsomorphic("paper", "title"));
  }

  @Test
  void test4() {
    Assertions.assertFalse(Solution205d.isIsomorphic("bbbaaaba", "aaabbbba"));
  }

  @Test
  void test5() {
    Assertions.assertFalse(Solution205d.isIsomorphic("badc", "baba"));
  }

  @Test
  void test6() {
    Assertions.assertFalse(Solution205d.isIsomorphic("baddc", "babga"));
  }

}
