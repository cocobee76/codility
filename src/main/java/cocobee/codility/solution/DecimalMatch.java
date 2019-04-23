package cocobee.codility.solution;

/**
 * Created by vince.chae on 2019-04-23 10:47
 */
public class DecimalMatch {

    public int solution(int a, int b) {

        String str_a = Integer.toString(a);
        String str_b = Integer.toString(b);

        return str_b.indexOf(str_a);
    }
}
