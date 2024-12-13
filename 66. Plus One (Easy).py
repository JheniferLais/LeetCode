class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """

        number = 0
        for digit in digits:
            number = number * 10 + digit

        number += 1

        result = []
        for digit in str(number):
            result.append(int(digit))

        return result


# Case 1
# Expected Output = [1, 2, 4]
digits = [1, 2, 3]
print(Solution().plusOne(digits))

# Case 2
# Expected Output = [4, 3, 2, 2]
digits = [4,3,2,1]
print(Solution().plusOne(digits))

# Case 3
# Expected Output = [1, 0]
digits = [9]
print(Solution().plusOne(digits))