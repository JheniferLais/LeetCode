class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]

# Case 1
# Expected Output = [0, 1]
nums = [2, 7, 11, 15]
print(Solution().twoSum(nums, 9))

# Case 2
# Expected Output = [1, 2]
nums = [3, 2, 4]
print(Solution().twoSum(nums, 6))

# Case 3
# Expected Output = [0, 1]
nums = [3, 3]
print(Solution().twoSum(nums, 6))