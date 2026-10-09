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
    public boolean isPalindrome(ListNode head) {
        // if(head==null)
        // {
        //     return false;
        // }
        // if(head.next==null)
        // {
        //     return true;
        // }
        // List<Integer> list=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null)
        // {
        //     list.add(temp.val);
        //     temp=temp.next;
        // }
        // int start=0;
        // int end=list.size()-1;
        // while(start<=end)
        // {
        //     if(list.get(start)!=list.get(end))
        //     {
        //         return false;
        //     }
        //     start++;
        //     end--;
        // }
        // return true;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode h=slow;
        while(h!=null)
        {
            ListNode front=h.next;
            h.next=prev;
            prev=h;
            h=front;
        }
        ListNode temp=prev;
        while(temp!=null)
        {
            if(head.val!=temp.val)
            {
                return false;
            }
            head=head.next;
            temp=temp.next;
        }
        return true;
    }
}