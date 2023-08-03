package 정렬;

// 셸 정렬

import java.util.Arrays;

public class ShellSort {

    public static void shellSort(int[] arr) {
        int gap = arr.length / 2;

        for (int i = gap; i > 0; i /= 2) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[j];

                int k = 0;
                for (k = j - i; k >= 0; k -= i) {
                    if (arr[k] > temp) {
                        arr[k + i] = arr[k];
                    } else {
                        break;
                    }
                }
                arr[k + i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {10, 32, 52, 27, 48, 17, 99, 56};
        shellSort(arr);
        System.out.println("셸 정렬: " + Arrays.toString(arr));
    }
}
