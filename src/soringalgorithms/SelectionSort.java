/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soringalgorithms;

/**
 *
 * @author josh
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] list = {6, 3, 7, 9, 12, 5, 7, 2, 9, 56, 100};
        int i, j;
        int minPos;
        print(list);
        for (j = 0; j < list.length+1; j++) {
            minPos = j;

            for (i = j + 1; i < list.length; i++) {
                if (list[i] < list[minPos]) {
                    minPos = i;
                }
            }
            
            if (minPos != j) {
                int temp = list[j];
                list[j] = list[minPos];
                list[minPos] = temp;
            }
            
            print(list);
        }

    }

    public static void print(int[] list) {
        for (int m : list) {
            System.out.print(m + ", ");

        }
        System.out.println("");
    }

}
