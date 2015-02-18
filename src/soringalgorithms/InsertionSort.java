/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soringalgorithms;

import static soringalgorithms.SelectionSort.print;

/**
 *
 * @author josh
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] list = {6, 3, 7, 9, 12, 5, 7, 2, 9, 56, 100};

        int j;
        int key;
        int i;
        print(list);
        for (i = 0; i < list.length; i++) {
            key = list[i];
            for (j = i - 1; (j >= 0) && (list[j] > key); j--) {
                list[j+1] = list[j];
            }
            list[j+1] = key;
            print(list);
        }
    }

}
