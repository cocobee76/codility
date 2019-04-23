package cocobee.codility.solution;

import java.util.stream.IntStream;

/**
 * Created by vince.chae on 2019-04-23 09:58
 */
public class Vacation {

    /**
     * 당신은 다가올 휴가를 외국에서 보내고 싶다. 여름에 당신은 N일의 연이은 휴가가 있다.
     * 당신은 여행사에 문의해서 나라 안의 몇몇 재미있는 지방에 방문할 것을 제안받았다.
     * 쉽게 말하면...
     * 각각의 지방은 0에서 N-1 까지로 정의할수 있다.
     * 여행은 비어있지 않은 배열인 A이다.
     * for each(0 <= K < N)에서 A[K]는 K번째 날짜의 여행목적지이다.
     * 여행사는 모든 지역을 방문하는 여행 계획은 가지고 있지 않으며 어떤 지역으로 가는 1개 이상의 여행 계획을 가지고 있다.
     * <p>
     * 당신은 휴가기간동안 매일 여행을 하고자 한다. 게다가 여행사가 제공하는 모든 여행지를 방문하고 싶다.
     * 당신은 같은 지역을 최소한 1번 이상 방문하게 될 것이지만 최대한 중복되는 방문을 피하고 싶다.
     * 목적은 여행사가 제공하는 모든 지역을 방문하는 가장 짧은 휴가기간(연이은 날짜 범위의)을 찾는 것이다.
     * <p>
     * 예를 들어, A 배열을 아래와 같이 가정하면
     * A[0] = 7
     * A[1] = 3
     * A[2] = 7
     * A[3] = 3
     * A[4] = 1
     * A[5] = 3
     * A[6] = 4
     * A[7] = 1
     * <p>
     * 여행사는 4개의 지역(1, 3, 4, 7)을 방문하는 여행을 제공한다. 0일째부터 시작하는 가장 짧은 휴가에서는 모든 지역을 다 방문하려면 6일째에 끝이난다.(즉, 7일이 걸린다.)
     * 그러나, 2일째에서 6일째 사이의 5일동안 당신은 역시 모든 지역을 방문 가능하다. 5일보다 휴가가 짧다면 당신은 적어도 하나의 지역을 방문하지 못할 것이다.
     */

    public static int solution(int[] arr) {

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
