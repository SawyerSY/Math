package neusoft.sawyer.learn;

import java.util.Objects;

/**
 * Created by sawyer on 2019-03-07.
 * <p>
 * Learn3-迭代
 */
public class Iteration {

    /**
     * 计算大于 1 的正整数平方根
     *
     * @param n              待求的数
     * @param deltaThreshold 误差的阀值
     * @param maxTry         二分差最后啊的最大次数
     * @return 平方根的解 ，如果n<=1返回-1.0，如果在最大查找次数都尝试完毕后没有找到符合阀值的结果则返回-2.0
     */
    static double getSquareRoot(int n, double deltaThreshold, int maxTry) {
        if (n <= 1) {
            return -1.0;
        }

        double min = 1.0, max = (double) n;

        for (int i = 0; i < maxTry; i++) {
            double middle = (min + max) / 2;
            double square = middle * middle;
            double delta = Math.abs((square / n) - 1);
            if (delta <= deltaThreshold) {
                System.out.println("Try times = " + (i + 1));
                return middle;
            } else {
                if (square > max) {
                    max = middle;
                } else {
                    min = middle;
                }
            }
        }

        return -2.0;
    }

    /**
     * 查找某个单词在字典中是否出现
     *
     * @param dictionary 有序的字典
     * @param keyword    待查询关键字
     * @return 是否查询到待查关键字
     */
    static boolean search(String[] dictionary, String keyword) {
        if (Objects.isNull(dictionary) || Objects.equals(0, dictionary.length)) {
            return false;
        }

        int left = 0, right = dictionary.length - 1, middle;

        while (left <= right) {
            middle = (left + right) >>> 1;
            String currentValue = dictionary[middle];
            if (Objects.equals(keyword, currentValue)) {
                return true;
            } else if (keyword.compareTo(currentValue) > 0) {
                left = middle + 1;
            } else if (keyword.compareTo(currentValue) < 0) {
                right = middle - 1;
            }
        }

        return false;
    }
}
