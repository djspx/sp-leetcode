package com.sergioparracho.sp_leetcode;

/**
 * @author Sergio Parracho 
 * GitHub: https://github.com/djspx 
 * LinkedIn: https://ca.linkedin.com/in/sergioparracho
 */

public class Solution725 {
  public static void main(String[] args) {
    ListNode node3 = new ListNode(3);
    ListNode node2 = new ListNode(2, node3);
    ListNode node1 = new ListNode(1, node2);

    splitListToParts(node1, 3);

    System.out.println(numElementsInGroup(142, 100));
  }

  public static ListNode[] splitListToParts(ListNode head, int k) {
    if (head == null) {
      return new ListNode[0];
    }
    int count = 0;
    ListNode node = head;
    while (node != null) {
      count++;
      node = node.next;
    }
    System.out.println(count);

    for (int i = 0; i < count; i++) {

    }

    ListNode[] groups = new ListNode[k];

    //		list[0] = head;
    for (int i = 1; i < k; i++) {
      //			list[i] = list[i-1].next == null ;
    }

    return groups;
  }

  private ListNode getNextNode(ListNode node) {
    return node.next;
  }

  private static int numElementsInGroup(int count, int groups) {
    return (int) Math.ceil(count / (double) groups);
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
