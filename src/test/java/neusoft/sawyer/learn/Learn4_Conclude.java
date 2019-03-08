package neusoft.sawyer.learn;

import org.junit.Test;

/**
 * Created by sawyer on 2019-03-08.
 */
public class Learn4_Conclude {

    @Test
    public void getNumberOfWheat() {
        int grid = 64;
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        System.out.println(String.format("通过迭代法计算，舍罕王给了这么多粒粮食：%s", Conclude.getNumberOfWheat(grid)));
        endTime = System.currentTimeMillis();
        System.out.println(String.format("通过迭代法计算，耗时：%sms", endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(String.format("通过数学归纳法公式计算，舍罕王给了这么多粒粮食：%s", (long) Math.pow(2, grid) - 1));
        endTime = System.currentTimeMillis();
        System.out.println(String.format("通过数学归纳法公式计算，耗时：%sms", endTime - startTime));
    }
}
