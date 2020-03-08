package cn;

/**
 * @author Gamigo
 * @create 2020/3/8 11:39
 * @description 66. 加一
 */
public class PlusOne {
    /**
     * 解题思路：先创建flag标志，数组从后往前判断是否有进位。如果溢出，创建新数组。
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int flag = 1;
        for (int i = digits.length - 1; flag != 0 && i >= 0; i--) {
            digits[i] += flag;
            if (digits[i] >= 10) {
                digits[i] = digits[i] % 10;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }
        return digits;
    }
}
