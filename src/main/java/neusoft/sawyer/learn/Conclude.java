package neusoft.sawyer.learn;

/**
 * Created by sawyer on 2019-03-08.
 *
 * Learn4-数学归纳法
 */
public class Conclude {

    static long getNumberOfWheat(int grid) {
        long sum = 0;
        for (int i = 0; i < grid; i++) {
            sum += Math.pow(2, i);
        }
        return sum;
    }
}
