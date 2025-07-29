class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //int[] nums1=new int[m+n];
        int i = m - 1;         // pointer at end of nums1's valid data
    int j = n - 1;         // pointer at end of nums2
    int k = m + n - 1;     // pointer at end of nums1's full size

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }

    // If any elements remain in nums2 (nums1's leftovers are already in place)
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
    }
}
