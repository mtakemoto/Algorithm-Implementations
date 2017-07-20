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
public class Algos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] test1 = {5, 4, 1, 7, 32, 90, 42};
        MergeSort.Sort(test1, 0, test1.length - 1);

        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i] + ", ");
        }
    }

}
