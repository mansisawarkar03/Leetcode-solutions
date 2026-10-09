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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // List<Integer> l1=new ArrayList<>();
        
        // ListNode temp1=list1;
        // ListNode temp2=list2;
        // while(temp1!=null)
        // {
        //     l1.add(temp1.val);
        //     temp1=temp1.next;
        // }
        // while(temp2!=null)
        // {
        //     l1.add(temp2.val);
        //     temp2=temp2.next;
        // }
        // Collections.sort(l1);
        // if(l1.isEmpty())
        // {
        //     return null;
        // }

        // ListNode head=new ListNode(l1.get(0));
        // ListNode temp=head;
        // for(int i=1;i<l1.size();i++)
        // {
        //     temp.next=new ListNode(l1.get(i));
        //     temp=temp.next;
        // }
        // return head;


        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                temp.next=list1;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null)
        {
            temp.next=list1;
        }
        else
        {
            temp.next=list2;
        }

        return dummy.next;
    }
}