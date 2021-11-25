package 链表;

//https://leetcode-cn.com/problems/middle-of-the-linked-list/
public class 链表的中间结点_876 {

    public ListNode middleNode(ListNode head) {

//        自己想的笨方法
//        int count = 0;
//        ListNode cur  = head;
//        while (cur.next != null){
//            cur = cur.next;
//            count++;
//        }
//        if(count%2 == 0){
//            for (int i = 0; i < count/2; i++) {
//                head = head.next;
//            }
//
//        }else{
//            for (int i = 0; i < (count+1)/2; i++) {
//                head = head.next;
//            }
//        }
//        return head.next;


//        快慢指针
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
