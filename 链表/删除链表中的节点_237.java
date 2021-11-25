package 链表;

//https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
public class 删除链表中的节点_237 {

    //删除链表中的一个节点，一般可以通过找到前面一个节点，将前面一个节点的next指向后一个节点
    //但是不能访问头节点的话，可以通过将后一个节点的val赋值给当前想要删除的，将当前的next指向后后一个节点，这样就可以删除指定的节点值了
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
