package linkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    int[] emptyArray = new int[] {};
    int[] singleNumber = new int[] {1};
    int[] fiveNumbers = new int[] {1,2,3,4,5};
    int[] reversedNumbers = new int[] {5,4,3,2,1};

    @Test
    public void willInitializeEmpty() {
        LinkedList list = new LinkedList(emptyArray);
        assertEquals(list.get(), null);
        System.out.println("Linked List handles empty array input");
    }

    @Test
    public void willInitializeSingle() {
        LinkedList list = new LinkedList(singleNumber);
        assertEquals(list.get().data, singleNumber[0]);
        System.out.println("Linked List initializes single element");
    }

    @Test
    public void willInitializeMultiple() {
        LinkedList list = new LinkedList(fiveNumbers);
        ListNode head = list.get();
        for(int num : fiveNumbers) {
            assertEquals(num, head.data);
            head = head.next;
        }
        System.out.println("List initializes multiple elements");
    }

}
