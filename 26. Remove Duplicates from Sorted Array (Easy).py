class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        k = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[k] = nums[i]
                k += 1
        return k

# Case 1
# Expected Output = 2, nums = [1,2,_]
nums = [1, 1, 2]
print(Solution().removeDuplicates(nums))

# Case 2
# Expected Output = 5, nums = [0,1,2,3,4,_,_,_,_,_]
nums = [0,0,1,1,1,2,2,3,3,4]
print(Solution().removeDuplicates(nums))