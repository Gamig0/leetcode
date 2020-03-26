package cn;

/**
 * @author Gamigo
 * @create 2020/3/26 9:26
 * @description 4. 寻找两个有序数组的中位数
 * 思路：合并两个有序数组，直接求中位数
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        return findMedian(mergeArr(nums1, nums2));

    }

    public int[] mergeArr(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            arr[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        if (i == nums1.length) {
            while (j < nums2.length) {
                arr[k++] = nums2[j++];
            }
        } else {
            while (i < nums1.length) {
                arr[k++] = nums1[i++];
            }
        }
        return arr;
    }


    public double findMedian(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        return arr.length % 2 == 0 ?
                (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2 :
                arr[arr.length / 2];
    }
}
