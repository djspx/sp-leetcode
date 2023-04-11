package com.sergioparracho.sp_leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */
class Solution724Test {

  @Test
  void test1() {
    int[] nums = new int[] { 1, 7, 3, 6, 5, 6 };
    Assertions.assertEquals(3, Solution724.pivotIndex(nums));
  }

  @Test
  void test2() {
    int[] nums = new int[] { 1, 2, 3 };
    Assertions.assertEquals(-1, Solution724.pivotIndex(nums));
  }

  @Test
  void test3() {
    int[] nums = new int[] { 2, 1, -1 };
    Assertions.assertEquals(0, Solution724.pivotIndex(nums));
  }

}
