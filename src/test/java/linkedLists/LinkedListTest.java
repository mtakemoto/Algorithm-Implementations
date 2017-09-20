package linkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    int[] singleNumber = new int[] {1};
    int[] fiveNumbers = new int[] {1,2,3,4,5};
    int[] reversedNumbers = new int[] {5,4,3,2,1};

    @Test
    public void willInitializeSingle() {
        LinkedList list = new LinkedList(singleNumber);
        assertEquals(list.get().data, singleNumber[0]);
        System.out.println("Linked List initializes single element");
    }

}
