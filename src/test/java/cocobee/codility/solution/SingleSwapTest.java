package cocobee.codility.solution;

import org.junit.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by vince.chae on 2019-04-23 10:32
 */
public class SingleSwapTest {

    private SingleSwap singleSwap = new SingleSwap();

    @Test
    public void testSolution() {

        int[] arr1 = {1, 2, 6, 3, 5, 3, 7};
        assertThat(singleSwap.solution(arr1), is(TRUE));

        int[] arr2 = {7, 2, 6, 3, 5, 3, 1};
        assertThat(singleSwap.solution(arr2), is(FALSE));

    }
}