import SinglyLinkedList.ListNode;

import java.util.HashSet;

public class problem142_detectCycle {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (hashSet.contains(head)) {
                return head;
            }
            hashSet.add(head);
            head = head.next;
        }
        return null;
    }
}
