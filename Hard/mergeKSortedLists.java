/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> Integer.compare(x, y));
        
        for(ListNode node: lists) {
            ListNode temp = node;
            while(temp != null) {
                pq.add(temp.val);
                temp = temp.next;
            }
        }
        if(pq.isEmpty())
            return null;
        ListNode result = new ListNode(pq.poll());
        ListNode temp = result;
        while(!pq.isEmpty()) {
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
        return result;
    }
}
