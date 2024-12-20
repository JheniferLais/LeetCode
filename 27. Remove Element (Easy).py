class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """

        i = 0
        while i < len(nums):
            if nums[i] == val:
                nums.pop(i)
            else:
                i += 1
        return len(nums)

# Case 1
# Expected Output = 2, nums = [2,2,_,_]
nums = [3,2,2,3]
print(Solution().removeElement(nums, 3))

# Case 2
# Expected Output = 5, nums = [0,1,4,0,3,_,_,_]
nums = [0,1,2,2,3,0,4,2]
print(Solution().removeElement(nums, 2))