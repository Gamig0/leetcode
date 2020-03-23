package cn;

/**
 * @author Gamigo
 * @create 2020/3/21 10:49
 * @description 365. 水壶问题
 *
 */
public class WaterAndJugProblem {

    public boolean canMeasureWater(int x, int y, int z) {
        // z最多装有x+y升水
        if (x + y < z) {
            return false;
        }

        // z最少装有0升水
        if (z == 0) {
            return true;
        }

        // 求x和y的最大公约数
        int k = gcd(x, y);

        // z是否为k的倍数。
        return z % k == 0;

    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
