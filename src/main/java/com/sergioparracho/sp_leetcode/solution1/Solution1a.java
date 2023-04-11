package com.sergioparracho.sp_leetcode.solution1;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

//Runtime141 ms
//Beats
//5.29%
//Memory42.5 MB
//Beats
//81.52%
public class Solution1a {
  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++)
    {
      for (int j = 0; j < nums.length; j++)
      {
        if (j == i)
        {
          continue;
        }
        if (nums[i] + nums[j] == target)
        {
          return new int[] { i, j };
        }
      }
    }
    
    return new int[] { -1, -1 };
  }
}
