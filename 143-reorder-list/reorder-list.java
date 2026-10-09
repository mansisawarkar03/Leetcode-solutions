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
    public void reorderList(ListNode head) {
        // List<Integer> list=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null)
        // {
        //     list.add(temp.val);
        //     temp=temp.next;
        // }
        // List<Integer> ans=new ArrayList<>();
        // int start=0;
        // int end=list.size()-1;
        // while(start<end)
        // {
        //     ans.add(list.get(start));
        //     ans.add(list.get(end));
        //     start++;
        //     end--;
        // }
        // if(start==end)
        // {
        //     ans.add(list.get(start));
        // }
        
        // temp=head;
        // for(int i=0;i<ans.size();i++)
        // {
        //     temp.val=ans.get(i);
        //     temp=temp.next;
        // }

        ListNode fast=head;
        ListNode slow=head;
        while(fast!= null && fast.next!=null)
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
        ListNode first=head;
        ListNode second=prev;
        while(second.next!=null)
        {
            ListNode front1=first.next;
            ListNode second1=second.next;
            first.next=second;
            second.next=front1;

            first=front1;
            second=second1;
        }
        
        
    }
}