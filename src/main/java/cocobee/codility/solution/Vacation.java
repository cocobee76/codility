package cocobee.codility.solution;

import java.util.stream.IntStream;

/**
 * Created by vince.chae on 2019-04-23 09:58
 */
public class Vacation {


    public static int solutionFor4(int[] arr) {

        //1. 방문할 지역 뽑기
        int[] location_arr = IntStream.of(arr).distinct().toArray();

        //2. Loop돌면서 locations가 다 포함된 일정 찾기
        int shortestDays = Integer.MAX_VALUE;

        _FOR:
        for (int i = 0; i <= arr.length - 1; i++) {
            boolean[] b_arr = new boolean[location_arr.length];
            int days = 0;
            for (int j = i; j <= arr.length - 1; j++) {
                for (int k = 0; k <= location_arr.length - 1; k++) {
                    if (location_arr[k] == arr[j]) {
                        System.out.print(location_arr[k] + " ");
                        days++;
                        b_arr[k] = true;
                        if (allTrue(b_arr)) {
                            System.out.println("StartDay: " + i + " ShortestDays: " + days);
                            if (shortestDays > days) {
                                shortestDays = days;
                            }
                            continue _FOR;
                        }
                    }
                }
            }
            System.out.println();
        }

        System.out.println("shortestDays: " + shortestDays);

        return shortestDays;
    }

    public static boolean allTrue(boolean[] arr_b) {
        for (boolean b : arr_b) {
            if (!b) {
                return false;
            }
        }
        return true;
    }


}
