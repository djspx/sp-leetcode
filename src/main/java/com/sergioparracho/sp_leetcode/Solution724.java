package com.sergioparracho.sp_leetcode;

/**
 * @author Sergio Parracho 
 * GitHub: https://github.com/djspx 
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

//Runtime1 ms
//Beats
//100%
//Memory43.6 MB
//Beats
//14.41%
class Solution724 {
	public static int pivotIndex(int[] nums) {
		int right = 0;
		for (int i = 0; i < nums.length; i++) {
			right += nums[i];
		}

		int left = 0;
		int pivot = 0;
		for (int i = 0; i < nums.length; i++) {
			pivot = nums[i];
			
			right -= pivot;
			
			if (left == right)
			{
				return i;
			}
			left += pivot;
		}

		return -1;
	}
}