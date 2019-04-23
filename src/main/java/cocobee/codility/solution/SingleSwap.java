package cocobee.codility.solution;

/**
 * Created by vince.chae on 2019-04-23 10:32
 */
public class SingleSwap {

    /**
     * 비어있지 않은 배열에서 최대 1회의 스왑으로 오름차순 정렬이 완성되는지 여부를 리턴
     *
     * @param arr
     * @return
     */
    public boolean solution(int[] arr) {
        //정렬을 한 이후의 배열과 정렬 이전의 배열을 비교해서 변경된 element가 2개 이하인지 검사

        int[] orgArr = arr.clone();
        SortUtils.selectionSort(arr);

        int swapCount = 0;
        for (int i = 0; i < orgArr.length; i++) {
            if (orgArr[i] != arr[i]) {
                swapCount++;
            }
            if (swapCount > 2) {
                return false;
            }
        }
        return true;
    }
}