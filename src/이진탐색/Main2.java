package 이진탐색;// 자바 기본 binarySearch

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 30, 40, 50, 60};

        System.out.println("== 데이터가 있는 경우 ==");
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 30));

        System.out.println("== 데이터가 없는 경우 ==");
        // 오름차순 정렬된 배열에서 해당 값이 원래 위치해야 할 인덱스를 음수로 바꿔주고 1을 더 뺀 값을 리턴한다.
        // 해당 값에 1을 더하고 부호를 반전 시키면 원래 해당 값이 들어가야 할 위치를 알 수 있다.
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 11));
        System.out.println(Arrays.binarySearch(arr, 35));

    }
}
