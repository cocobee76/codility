package cocobee.codility.solution;

/**
 * Created by vince.chae on 2019-04-23 10:41
 */
public class Coins {


    public int solution(int[] arr) {

        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        if (arr.length / 2 < sum) {
            return arr.length - sum;
        } else {
            return sum;
        }
    }

    public int solution_2(int[] arr) {

        int[] coins = new int[2];

        for (int value : arr) {
            coins[value]++;
        }

        SortUtils.bubbleSort(coins);

        return coins[0];
    }

}
