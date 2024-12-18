class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """

        stack = []
        for char in s:
            if char in "({[":
                stack.append(char)
            elif char == ")" and stack and stack[-1] == "(":
                stack.pop()
            elif char == "}" and stack and stack[-1] == "{":
                stack.pop()
            elif char == "]" and stack and stack[-1] == "[":
                stack.pop()
            else:
                return False
        return not stack

# Case 1
# Expected Output = true
s = "()"
print(Solution().isValid(s))

# Case 2
# Expected Output = true
s = "()[]{}"
print(Solution().isValid(s))

# Case 3
# Expected Output = false
s = "(]"
print(Solution().isValid(s))

# Case 4
# Expected Output = true
s = "([])"
print(Solution().isValid(s))