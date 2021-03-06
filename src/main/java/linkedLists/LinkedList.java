package linkedLists;

public class LinkedList {
    private ListNode head = null;

    LinkedList() {
        return;
    }

    LinkedList(int[] a) {
        if(a.length == 0) return;
        head = new ListNode(a[0]);
        if(a.length == 1) return;
        ListNode iter = head;
        for(int i=1; i<a.length; i++) {
            iter.next = new ListNode(a[i]);
            iter = iter.next;
        }
    }

    public ListNode get() {
        return this.head;
    }

    public ListNode append(int data) {
        ListNode newNode = new ListNode(data);
        if(this.head == null) this.head = newNode;
        ListNode iter = head;
        while(iter.next != null) {
            iter = iter.next;
        }
        iter.next = newNode;
        return head;
    }

    public ListNode pop() {
        if(head == null) return null;
        ListNode firstNode = new ListNode(head.data);
        head = head.next;
        return firstNode;
    }

    public ListNode remove() {
        if(head == null) return null;
        if(head.next == null) {
            head = null;
            return null;
        }
        ListNode iter = head;
        while(iter.next != null) {
            iter = iter.next;
        }
        iter.next = null;
        return head;
    }

    public void reverse() {
        if(head == null) return;

        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
}
