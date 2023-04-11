package com.sergioparracho.sp_leetcode;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

//Runtime0 ms
//Beats
//100%
//Memory42.9 MB
//Beats
//21.62%
public class Solution1480 {
  public int[] runningSum(int[] nums) {
    int[] output = new int[nums.length];
    int total = 0;
    for (int i = 0; i < nums.length; i++) {
      output[i] = nums[i] + total;
      total += nums[i];
    }

    return output;
  }
}
