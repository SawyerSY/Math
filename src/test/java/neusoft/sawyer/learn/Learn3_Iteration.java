package neusoft.sawyer.learn;

import org.junit.Test;

/**
 * Created by sawyer on 2019-03-07.
 * <p>
 * 1.求数值的精确或者近似解：二分法（Bisection Method）、牛顿迭代法（Newton's Method）
 * 2.在一定范围内查找目标值
 * 3.机器学习算法中的迭代：K-均值算法（K-means clustering）、、
 */
public class Learn3_Iteration {

    /**
     * Gets square root.
     */
    /*
     * 求方程的精确或者近似解
     * */
    @Test
    public void getSquareRoot() {
        System.out.println(Iteration.getSquareRoot(10, 1, 100));
        System.out.println(Iteration.getSquareRoot(10, 0.1, 100));
        System.out.println(Iteration.getSquareRoot(100, 1, 100));
        System.out.println(Iteration.getSquareRoot(1000, 1, 100));
        System.out.println(Iteration.getSquareRoot(10000, 1, 5));
    }

    /**
     * 二分查找字段中是否存在某个关键字
     */
    @Test
    public void search() {
        String[] dictionary = {"1", "2", "3", "4", "5"};
        System.out.println(Iteration.search(dictionary, "1"));
        System.out.println(Iteration.search(dictionary, "2"));
        System.out.println(Iteration.search(dictionary, "3"));
        System.out.println(Iteration.search(dictionary, "4"));
        System.out.println(Iteration.search(dictionary, "5"));
        System.out.println(Iteration.search(dictionary, "6"));
        System.out.println(Iteration.search(dictionary, "7"));
    }
}
