/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

/**
 *
 * @author doyou
 */
public class MergeSort {
    
    public static void Sort(int[] A, int low, int high) {
        if(low < high) {
            int mid = (int)Math.floor((low + high) / 2);
            Sort(A, low, mid);
            Sort(A, mid+1, high);
            Merge(A, low, mid, high);
        }
    }
    
    private static void Merge(int[] A, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];
        
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        
        for(int i=0; i < n1; i++) {
            L[i] = A[low + i];
        }
        for(int j=0; j < n2; j++) {
            R[j] = A[mid + j + 1];
        }
        int i = 0;
        int j = 0;
        for(int k=low; k<=high; k++) {
            if(L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
        }
    }
}
