class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """

        if not strs:
            return ""

        aux = ""
        for i in range(len(strs[0])):
            char = strs[0][i]
            for word in strs:
                if i >= len(word) or word[i] != char:
                    return aux
            aux += char
        return aux


# Case 1
# Expected Output = "fl"
strs = ["flower","flow","flight"]
print(Solution().longestCommonPrefix(strs))

# Case 2
# Expected Output = ""
strs = ["dog","racecar","car"]
print(Solution().longestCommonPrefix(strs))