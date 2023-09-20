package LinkList;

public class GetKthFromEnd {
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            while (head!=null){
                ListNode tmp=new ListNode();
                for(int i=0;i<k;i++){
                    tmp=head.next;
                }
            }
        }
    }
}
