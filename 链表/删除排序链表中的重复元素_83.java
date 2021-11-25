package 链表;

public class 删除排序链表中的重复元素_83 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

//        head.next = deleteDuplicates(head.next);
//        if(head.val == head.next.val) head = head.next;
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }

        return head;
    }
}
