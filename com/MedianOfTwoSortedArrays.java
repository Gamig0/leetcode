package com;

/**
 * @author Gamigo
 * @create 2020/3/11 9:16
 * @description 4.Median of Two Sorted Arrays
 * 使用长度为m+n的数组从后往前将两个数组合并，再找出中位数。
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length - 1;
        int n = nums2.length - 1;
        int[] arr = new int[m + n + 2];
        for (int i = arr.length - 1; m >= 0 && n >= 0; i--) {
            if (nums1[m] > nums2[n]) {
                arr[i] = nums1[m];
                m--;
            } else {
                arr[i] = nums2[n];
                n--;
            }
        }
        // 添加m或n中剩余数组到arr中
        if (m >= 0) {
            for (int i = m; i >= 0; i--) {
                arr[i] = nums1[i];
            }
            // 拷贝nums1[0,m + 1)到arr
            /* System.arraycopy(nums1, 0, arr, 0, m + 1); */
        } else {
            for (int i = n; i >= 0; i--) {
                arr[i] = nums2[i];
            }
            /* System.arraycopy(nums2, 0, arr, 0, n + 1); // 此方法可替代上方for循环*/
        }

        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (double)(arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }

    }
}
