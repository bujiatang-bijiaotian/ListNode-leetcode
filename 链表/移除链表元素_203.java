package 链表;

//https://leetcode-cn.com/problems/remove-linked-list-elements/
public class 移除链表元素_203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode temp = header;
        while (temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }

        }

        return header.next;
    }
}
