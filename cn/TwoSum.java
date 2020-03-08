package cn;

/**
 * @author Gamigo
 * @create 2020/3/7 20:58
 * @description 1. 两数之和
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;

    }
}
