class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """

        s = s.strip()

        words = s.split(" ")

        return len(words[-1])

# Case 1
# Expected Output = 5
s = "Hello World"
print(Solution().lengthOfLastWord(s))

# Case 2
# Expected Output = 4
s = "   fly me   to   the moon  "
print(Solution().lengthOfLastWord(s))

# Case 3
# Expected Output = 6
s = "luffy is still joyboy"
print(Solution().lengthOfLastWord(s))