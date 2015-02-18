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
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] list = {6, 3, 7, 9, 12, 5, 7, 2, 9, 56, 100};
        print(list);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] < list[j]) {
                    //swap
                    int t = list[i];
                    list[i] = list[j];
                    list[j] = t;
                }
            }
            print(list);
        }
    }

}
