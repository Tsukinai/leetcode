package LinkList;

public class MergeTwoLists {
    public static void main(String[] args) {

    }

    //TODO
    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode head = new ListNode();
            while (list1 != null && list2 != null) {

            }
            if (head == null) {
                if (list1 == null) {
                    head = list2;
                } else {
                    head = list1;
                }
            } else {
                if (list1 == null) {
                    head.next = list2;
                } else {
                    head.next = list1;
                }
            }
            return head;
        }
    }
}
