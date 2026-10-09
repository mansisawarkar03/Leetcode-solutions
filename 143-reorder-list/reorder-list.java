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
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        List<Integer> ans=new ArrayList<>();
        int start=0;
        int end=list.size()-1;
        while(start<end)
        {
            ans.add(list.get(start));
            ans.add(list.get(end));
            start++;
            end--;
        }
        if(start==end)
        {
            ans.add(list.get(start));
        }
        
        temp=head;
        for(int i=0;i<ans.size();i++)
        {
            temp.val=ans.get(i);
            temp=temp.next;
        }
        
        
    }
}