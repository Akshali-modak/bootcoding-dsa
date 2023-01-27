package leetcode.quetions;

public class IntersectionLinkedlist {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;

        while (temp != null){

            ListNode temp1 = headB;
            while(temp1 != null){

                if(temp == temp1){

                    return temp;
                }
                temp1 = temp1.next;
            }
            temp = temp.next;
        }
        return null;
    }
}
