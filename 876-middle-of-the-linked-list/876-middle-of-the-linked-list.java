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
    public ListNode middleNode(ListNode head) {
        //count nodes
        int count = 1;
        ListNode temp = head;
        while(temp.next != null){
           temp = new ListNode(temp.next.val,temp.next.next);
            count ++;
        }
        if(count==1){
            return head;
        }
        
        // case two middle nodes
        if(count % 2 == 0){
            temp = head;
            for (int i=1;i<=count/2;i++){
                 if(i==(count/2)){
                    return temp.next;
                 } 
                temp = new ListNode(temp.next.val,temp.next.next);       
            }
        }
        // case one middle node
        else{
             temp = head;
            for (int i=1;i<=(count/2);i++){
                 if(i==(count/2)){
                    return temp.next;
                 } 
                temp = new ListNode(temp.next.val,temp.next.next);       
            }
        }
        
        return null;
    }
}