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
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null)
        {
            return null;
        }

        // HashSet<Integer> set=new HashSet<>();

        // ListNode h=head;
        // while(h!=null)
        // {
        //     set.add(h.val);
        //     h=h.next;
        // }

        // ArrayList<Integer> list=new ArrayList<>(set);
        // Collections.sort(list);
        // ListNode l=new ListNode(list.get(0));
        // ListNode m=l;
        // for(int i=1;i<set.size();i++)
        // {
        //     l.next=new ListNode(list.get(i));
        //     l=l.next;

        // }
        // l.next=null;

        // return m;

        
        ListNode cur=head;

        while(cur!=null && cur.next!=null)
        {
            if(cur.val==cur.next.val)
            {
                cur.next=cur.next.next;
            }
            else
            {
                
                cur=cur.next;
            }
        }

        return head;
    }


}