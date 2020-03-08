package cn;

/**
 * @author Gamigo
 * @create 2020/3/6 16:22
 * @description 88. Merge Sorted Array
 */
public class MergeSortedArray {

    /**
     * 合并两个数组，选择排序。。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[k];
            k++;
        }
        for (int i = 0; i < m + n-1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (nums1[i] > nums1[j]) {
                    k = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = k;
                }
            }
        }
    }

    /**
     * 从后往前比较两数组元素并添加。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = --m;
        System.out.println("i = " + i);
        int j = --n;
        System.out.println("j = " + j);
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        if (i == 0) {
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
        }
    }

}
