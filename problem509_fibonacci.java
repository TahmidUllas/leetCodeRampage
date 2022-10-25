import SinglyLinkedList.ListNode;

import java.util.HashSet;

public class problem509_fibonacci {
    public int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
}
