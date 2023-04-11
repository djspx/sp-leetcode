package com.sergioparracho.sp_leetcode;

import java.util.HashMap;
import java.util.Map;

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
public class Solution1 {
  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> complementMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      Integer complementIndex = complementMap.get(nums[i]);
      if (complementIndex != null) {
        return new int[] { complementIndex, i };
      }
      complementMap.put(target - nums[i], i);
    }

    return nums;
  }
}
