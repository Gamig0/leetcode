package cn;

import java.util.Arrays;

/**
 * @author Gamigo
 * @create 2020/3/13 22:02
 * @description 169. 多数元素
 * 解题思路，Arrays工具类将数组排序，从下标1往后扫描数组，比较相邻两数是否相等，
 * 如果不相等判断小下表数的个数是否超过n/2个，如果不超过将计数置为1，继续往后扫描，
 * 因为题中说明一定有「多数元素」所以最后直接返回数组中的最后一个元素。
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                count++;
            }  else {
                if (count > nums.length / 2) {
                    return nums[i - 1];
                }
                count = 1;
                continue;
            }
        }
        return nums[nums.length - 1];
    }
}
