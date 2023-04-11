package com.sergioparracho.sp_leetcode.solution1;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

//Runtime36 ms
//Beats
//54.14%
//Memory42.7 MB
//Beats
//64.68%
public class Solution1b {
  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++)
    {
      int missingAdendPosition = getMissingComplementPosition(nums[i], nums, target, i + 1);
      if (missingAdendPosition > -1)
      {
        return new int[] { i, missingAdendPosition};
      }
    }
    
    return new int[] { -1, -1 };
  }
  
  static int getMissingComplementPosition(int addend1, int[] nums, int target, int startPosition)
  {
    for (int j = startPosition; j < nums.length; j++)
    {
      if (target - nums[j] == addend1)
      {
        return j;
      }
    }
    
    return -1;
  }
}
