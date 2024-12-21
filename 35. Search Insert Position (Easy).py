class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """

        for i in range(len(nums)):
            if nums[i] >= target:
                return i
        return len(nums)

# Case 1
# Expected Output = 2
nums = [1, 3, 5, 6]
print(Solution().searchInsert(nums, 5))

# Case 2
# Expected Output = 1
nums = [1, 3, 5, 6]
print(Solution().searchInsert(nums, 2))

# Case 3
# Expected Output = 4
nums = [1, 3, 5, 6]
print(Solution().searchInsert(nums, 7))