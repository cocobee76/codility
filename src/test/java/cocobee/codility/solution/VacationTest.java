package cocobee.codility.solution;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by vince.chae on 2019-04-23 10:12
 */
public class VacationTest {

    @Test
    public void testSolution() {

        //expect 3
        int[] arr_1 = {2, 1, 1, 3, 2, 1, 1, 3};
        assertThat(Vacation.solution(arr_1), is(3));

        //expect 6
        int[] arr_2 = {7, 5, 2, 7, 2, 7, 4, 7};
        assertThat(Vacation.solution(arr_2), is(6));

        //expect 5
        int[] arr_3 = {1, 2, 2, 2, 3, 3, 4, 1};
        assertThat(Vacation.solution(arr_3), is(5));
    }
}