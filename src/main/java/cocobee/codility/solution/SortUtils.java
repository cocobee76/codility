package cocobee.codility.solution;

/**
 * Created by vince.chae on 2019-04-23 10:41
 */
public class SortUtils {

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--)// main loop, i 는 (배열의 길이 - 1) 에서 1까지 1씩 감소
            for (int j = 0; j < i; j++) {   // j 는 0부터 i 까지 1씩 증가하며 반복
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
    }

    public static void selectionSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = 0; // 배열 원소중 max 값의 index를 저장할 변수
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[maxIndex]) maxIndex = j;
            }
            swap(arr, maxIndex, i);
        }
    }

    public static void swap(int[] array, int fromIdx, int targetIdx) {
        int temp = array[targetIdx];
        array[targetIdx] = array[fromIdx];
        array[fromIdx] = temp;
    }

}
