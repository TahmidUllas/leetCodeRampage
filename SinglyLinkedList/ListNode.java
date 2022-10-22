package SinglyLinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + printListOfNode(this, "") + "]";
    }

    private String printListOfNode(ListNode listNode, String str) {
        return listNode==null? str:getString(listNode, str);
    }

    private String getString(ListNode listNode, String str) {
        str = str.concat(String.valueOf(listNode.val));
        return str.concat(printListOfNode(listNode.next, str));
    }
}
