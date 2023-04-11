package com.sergioparracho.sp_leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

class Solution1480Test {

  @Test
  void test() {
    Solution1480 s = new Solution1480();
    int[] nums = new int[] { 1, 2, 3, 4 };
    int[] actual = s.runningSum(nums);
    int[] expected = new int[] {1, 3, 6, 10}; 
    Assertions.assertArrayEquals(expected, actual);
  }
}
