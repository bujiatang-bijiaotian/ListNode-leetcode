package 链表;

public class 删除链表的倒数第N个结点_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;

        ListNode newHead = new ListNode(-1);
        newHead.next = head;

        ListNode slow = newHead;
        ListNode fast = newHead;

        for (int i = 0; i < n; i++) {
             fast = fast.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return newHead.next;
    }
}
