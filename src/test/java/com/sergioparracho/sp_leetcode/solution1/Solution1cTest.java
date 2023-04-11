package com.sergioparracho.sp_leetcode.solution1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */
class Solution1cTest {

  @Test
  void test1() {
    Assertions.assertArrayEquals(Solution1c.twoSum(new int[] { 2, 7, 11, 15 }, 9), new int[] { 0, 1 });
  }

  @Test
  void test2() {
    Assertions.assertArrayEquals(Solution1c.twoSum(new int[] { 3, 2, 4 }, 6), new int[] { 1, 2 });
  }

  @Test
  void test3() {
    Assertions.assertArrayEquals(Solution1c.twoSum(new int[] { 3, 3 }, 6), new int[] { 0, 1 });
  }

}
