import SinglyLinkedList.ListNode;

public class problem21_mergeTwoList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return list2 == null ? list1 : list1 == null ? list2 : getListNode(list1, list2);
    }

    private static ListNode getListNode(ListNode list1, ListNode list2) {
        return list1.val <= list2.val ? getNode(list1, list1.next, list2) : getNode(list2, list1, list2.next);
    }

    private static ListNode getNode(ListNode list2, ListNode list1, ListNode list21) {
        list2.next = mergeTwoLists(list1, list21);
        return list2;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode head2 = new ListNode();
        System.out.println(mergeTwoLists(head, head2));
        head = populateNodes(new int[]{1, 2, 5, 8});
        head2 = populateNodes(new int[]{1, 4, 5, 9});
        System.out.println(mergeTwoLists(head, head2));

    }

    private static ListNode populateNodes(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode cnt = head;
        for (int i = 1; i < arr.length; i++) {
            cnt.next = new ListNode(arr[i]);
            cnt = cnt.next;
        }
        return head;
    }
}
