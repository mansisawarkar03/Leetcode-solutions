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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null || head.next==null)
        {
            return null;
        }

        int l=0;
        ListNode temp=head;
        while(temp!=null)
        {
            l++;
            temp=temp.next;
        }
        int mid=l-n;
        if(l==n) return head.next;
        temp=head;
        while(temp!=null)
        {
            mid=mid-1;
            if(mid==0)
            {
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;

        }
        return head;
        
    }
}