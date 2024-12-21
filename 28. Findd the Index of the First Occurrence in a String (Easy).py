class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """

        if not needle:
            return 0

        if needle in haystack:
            return haystack.index(needle)

        return -1

# Case 1
# Expected Output = 0
haystack = "sadbutsad"
needle = "sad"
print(Solution().strStr(haystack, needle))

# Case 2
# Expected Output = -1
haystack = "leetcode"
needle = "leeto"
print(Solution().strStr(haystack, needle))