class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """

        romano = {'I': 1, 'V': 5, 'X': 10, 'L': 50,'C': 100, 'D': 500, 'M': 1000}

        total = 0
        previous = 0
        for char in reversed(s):
            current = romano[char]
            if current < previous:
                total -= current
            else:
                total += current
            previous = current
        return total

# Case 1...
# Expected Output = 3
x = 'III'
print(Solution().romanToInt(x))

# Case 1...
# Expected Output = 58
x = 'LVIII'
print(Solution().romanToInt(x))

# Case 1...
# Expected Output = 1994
x = 'MCMXCIV'
print(Solution().romanToInt(x))