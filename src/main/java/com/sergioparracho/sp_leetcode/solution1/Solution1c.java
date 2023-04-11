package com.sergioparracho.sp_leetcode.solution1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergio Parracho
 * GitHub: https://github.com/djspx
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

//Runtime2 ms
//Beats
//81.84%
//Memory42.4 MB
//Beats
//88.11%
public class Solution1c {
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
