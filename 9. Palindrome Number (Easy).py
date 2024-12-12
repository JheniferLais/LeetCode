class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """

        if x < 0:
            return False

        aux = x
        aux_rev = 0
        while x > 0:
            aux_rev = aux_rev * 10 + x % 10
            x //= 10

        return aux == aux_rev

# Case 1...
# Expected Output = True
x = 121
print(Solution().isPalindrome(x))

# Case 2...
# Expected Output = False
x = -121
print(Solution().isPalindrome(x))

# Case 3...
# Expected Output = False
x = 10
print(Solution().isPalindrome(x))