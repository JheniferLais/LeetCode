class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """

        int_a = int(a, 2)
        int_b = int(b, 2)

        result_int = int_a + int_b

        return bin(result_int)[2:]

# Case 1
# Expected Output = "100"
a = "11"
b = "1"
print(Solution().addBinary(a, b))

# Case 2
# Expected Output = "10101"
a = "1010"
b = "1011"
print(Solution().addBinary(a, b))