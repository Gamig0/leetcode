package cn;

import java.util.Arrays;

/**
 * @author Gamigo
 * @create 2020/3/14 8:23
 * @description
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        int len = 0;
        for (int num: nums) {
            int idx = Arrays.binarySearch(res, 0, len, num);
            idx = idx < 0? -idx - 1: idx;
            res[idx] = num;
            if (idx == len) {
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums= {10, 9, 2, 5, 3, 7, 101, 18};
        LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();

        int result = l.lengthOfLIS(nums);
        System.out.println("result = " + result);
    }
}
