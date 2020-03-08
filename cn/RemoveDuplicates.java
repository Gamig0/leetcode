package cn;

/**
 * @author Gamigo
 * @create 2020/3/3 22:06
 * @description 26. 删除排序数组中的重复项
 */
public class RemoveDuplicates {

    /**
     * 使用两个指针，i指针始终指向结果数组当前的最后一个元素。
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 1) {
            return nums.length;
        }
        int i = 0;
        int j = 1;
        while(j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return ++i;

    }
}
