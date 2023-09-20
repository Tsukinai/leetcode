package LinkList;

public class GetDecimalValue {
    class Solution {
        public int getDecimalValue(ListNode head) {
            while (head.next != null) {
                head.next.val += head.val * 2;
                head = head.next;
            }
            return head.val;
        }
    }
}
