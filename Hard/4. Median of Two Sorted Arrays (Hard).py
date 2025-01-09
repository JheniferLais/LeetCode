class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """

        merge_array = sorted(nums1 + nums2)
        n = len(merge_array)
        if n % 2 == 0:
            return (merge_array[n // 2 - 1] + merge_array[n // 2]) / 2.0
        else:
            return merge_array[n // 2]

# Case 1...
# Expected Output = 2
nums1 = [1, 3]
nums2 = [2]
print(Solution().findMedianSortedArrays(nums1, nums2))

# Case 2...
# Expected Output = 2.5
nums1 = [1, 2]
nums2 = [3, 4]
print(Solution().findMedianSortedArrays(nums1, nums2))