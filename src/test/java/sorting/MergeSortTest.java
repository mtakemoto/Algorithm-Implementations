/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {
    
    public MergeSortTest() {
        
    }
    
    @Test
    public void testNullInput() {
        System.out.println("Null input");
        Sorting.MergeSort.Sort(null);
    }
    
    @Test
    public void testSingleElement() {
        System.out.println("Single element sort");
        int[] initial = {1};
        int[] expected = {1};
        Sorting.MergeSort.Sort(initial);
        assertArrayEquals(initial, expected);
    }
    
    @Test
    public void testSortOdd() {
        System.out.println("Odd number of elements");
        int[] initial = {10, 7, 9, 6, 8};
        int[] expected = {6, 7, 8, 9, 10};
        Sorting.MergeSort.Sort(initial);
        assertArrayEquals(initial, expected);
    }
    
    @Test
    public void testSortEven() {
        System.out.println("Even number of elements");
        int[] initial = {4, 2, 1, 3};
        int[] expected = {1, 2, 3, 4};
        Sorting.MergeSort.Sort(initial);
        assertArrayEquals(initial, expected);
    }
    
    @Test
    public void testAllEqualNumbers() {
        System.out.println("All elements are equal");
        int[] initial = {1, 1, 1};
        int[] expected = {1, 1, 1};
        Sorting.MergeSort.Sort(initial);
        assertArrayEquals(initial, expected);
    }
    
    @Test
    public void testDuplicateNumbers() {
        System.out.println("Handles duplicate elements");
        int[] initial = {2, 2, 1, 3, 4, 4, 5};
        int[] expected = {1, 2, 2, 3, 4, 4, 5};
        Sorting.MergeSort.Sort(initial);
        assertArrayEquals(initial, expected);
    }
}
