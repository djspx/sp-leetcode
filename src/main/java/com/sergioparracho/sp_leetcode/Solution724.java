package com.sergioparracho.sp_leetcode;

/**
 * @author Sergio Parracho 
 * GitHub: https://github.com/djspx 
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

class Solution724 {

	public static void main(String[] args) {
//		System.out.println(pivotIndex(new int[] { 1,7,3,6,5,6 }));
		System.out.println(pivotIndex(new int[] { 1, 2, 3 }));
//		System.out.println(pivotIndex(new int[] { 2,1,-1 }));
//		System.out.println(pivotIndex(new int[] { -1,-1,-1,-1,-1,0 }));
//		System.out.println(pivotIndex(new int[] { -1,-1,-1,-1,-1,-1 }));

	}

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