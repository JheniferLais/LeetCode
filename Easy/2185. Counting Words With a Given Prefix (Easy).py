class Solution(object):
    def prefixCount(self, words, pref):
        count = 0
        for word in words:
            if word.startswith(pref):
                count += 1
        return count

# Case 1
# Expected Output = 2
words = ["pay","attention","practice","attend"]
pref = "at"
print(Solution().prefixCount(words, pref))

# Case 2
# Expected Output = 0
words = ["leetcode","win","loops","success"]
pref = "code"
print(Solution().prefixCount(words, pref))