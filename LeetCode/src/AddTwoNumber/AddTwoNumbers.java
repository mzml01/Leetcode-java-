package AddTwoNumber;
import java.util.*;
public class AddTwoNumbers {
    public ListNode Solution(ListNode l1, ListNode l2) {
        ListNode DummyHead = new ListNode(0);
        ListNode Tail = DummyHead;
        int carry = 0;
        ListNode result = null;
        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;
            int sum = digit1 + digit2 + carry;
            int least = sum % 10;
            carry = sum / 10;
            result = new ListNode(least);
            Tail.next = result;
            Tail = Tail.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        ListNode ans=DummyHead.next;
        DummyHead.next=null;
        return ans;
    }
    public static void main(String[] args){
        AddTwoNumbers obj=new AddTwoNumbers();
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(5);
        ListNode result=obj.Solution(l1,l2);
        while(result!=null){
            System.out.print(result.val);
            result=result.next;
        }

    }
}
