/*

                Tahereh Farhang , Barbod Accademy , 2nd session , 4th excercise.
                        Sort and binery search
 */
package sort.and.search;

import java.util.Scanner;

/**
 *
 * @author Totia
 */
public class SortAndSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter length of Array: ");
        int num1 = sc.nextInt();
        int[] intArray1 = new int[num1];
        for (int i = 0; i < intArray1.length; i++) {
            System.out.print(String.format("Number %d : ", i));
            intArray1[i] = sc.nextInt();
        }
        int j;

        for (int i = 0; i < intArray1.length; i++) {
            for (j = 0; j < intArray1.length; j++) {
                if (intArray1[i] < intArray1[j]) {
                    int empt = intArray1[i];
                    intArray1[i] = intArray1[j];
                    intArray1[j] = empt;
                }
            }
        }
        System.out.println("Your numbers after sorting :");
        for (int i = 0; i < intArray1.length; i++) {
            System.out.println(String.format("%d", intArray1[i]));
        }

        System.out.print("Please inter your number to search: ");
        int searchNum = sc.nextInt();
        int mid = intArray1.length / 2;
        boolean flag = true;
        while (flag) {
            if (searchNum == intArray1[mid]) {
                flag = false;
                System.out.println(String.format(" %d is found in intArray[%d]", searchNum, mid));
            } else if (searchNum < intArray1[mid]) {
                mid = mid / 2;
            } else {
                mid = (mid + intArray1.length) / 2;
            }
        }

    }
}
