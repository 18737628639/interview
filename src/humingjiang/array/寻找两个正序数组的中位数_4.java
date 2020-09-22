package humingjiang.array;

/**
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 *
 * @author xmmm
 */
public class 寻找两个正序数组的中位数_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int left = -1;
        int right = -1;
        int astart = 0;
        int bstart = 0;
        for (int i = 0; i < length / 2; i++) {
            left = right;
            if (astart < nums1.length && (bstart > nums2.length || nums1[astart] < nums2[astart])) {
                right = nums1[astart++];
            }else {

            }
        }
    }
}
