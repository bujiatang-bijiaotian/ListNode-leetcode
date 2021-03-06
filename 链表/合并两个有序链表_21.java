package 链表;

public class 合并两个有序链表_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        先创建一个虚拟头节点
        ListNode newHead = new ListNode();
        ListNode cur = newHead;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
            if(l1.val > l2.val){
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if(l1 == null) cur.next = l2;
        if(l2 == null) cur.next = l1;

        return newHead.next;
    }
}
