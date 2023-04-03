package com.sergioparracho.sp_leetcode;

/**
 * @author Sergio Parracho 
 * GitHub: https://github.com/djspx 
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

//Runtime5 ms
//Beats
//91.62%
//Memory42.2 MB
//Beats
//78.80%
public class Solution205 {
  public static boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    if (s == null || s.length() == 0 || t == null || t.length() == 0) {
      return false;
    }

    int[] map = new int[256];
    int[] mappedBefore = new int[256];

    for (int i = 0; i < s.length(); i++) {
      int sc = (int) s.charAt(i);
      int tc = (int) t.charAt(i);
      if (map[sc] != 0) {
        if (map[sc] != tc) {
          return false;
        }
      } else if (mappedBefore[tc] == 1) {
        return false;
      }
      map[sc] = tc;
      mappedBefore[tc] = 1;
    }

    return true;
  }
}
