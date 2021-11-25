package 链表;
//https://leetcode-cn.com/problems/reverse-linked-list/
public class 反转链表_206 {

    //递归解法
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // 迭代解法
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = null;
        while (head!=null){
            ListNode temp =  head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }

        return newHead;
    }

}
