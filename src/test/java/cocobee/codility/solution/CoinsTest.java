package cocobee.codility.solution;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by vince.chae on 2019-04-23 10:43
 */
public class CoinsTest {

    private Coins coins = new Coins();

    @Test
    public void testSolution() {

        //expect 2
        int[] arr = {0, 1, 1, 0, 0};
        assertThat(coins.solution(arr), is(2));
        assertThat(coins.solution_2(arr), is(2));

        //expect 3
        int[] arr2 = {1, 1, 0, 1, 1, 0, 0};
        assertThat(coins.solution(arr2), is(3));
        assertThat(coins.solution_2(arr2), is(3));

        //expect 4
        int[] arr3 = {0, 1, 0, 1, 1, 0, 1, 0};
        assertThat(coins.solution(arr3), is(4));
        assertThat(coins.solution_2(arr3), is(4));


    }

}