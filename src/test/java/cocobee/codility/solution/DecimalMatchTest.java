package cocobee.codility.solution;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by vince.chae on 2019-04-23 10:48
 */
public class DecimalMatchTest {

    DecimalMatch decimalMatch = new DecimalMatch();

    @Test
    public void testSolution(){

        //expect 2
        assertThat(decimalMatch.solution(67, 1267893672), is(2));

        //expect -1
        assertThat(decimalMatch.solution(34, 398294001), is(-1));


    }

}