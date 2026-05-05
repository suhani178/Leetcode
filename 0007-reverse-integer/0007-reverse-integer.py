class Solution:
    def reverse(self, x: int) -> int:
        INT_MIN, INT_MAX = -2**31, 2**31 - 1

        neg = x < 0
        x = abs(x)
        rev = 0

        while x != 0:
            digit = x % 10
            x = x // 10

            # Check for overflow before updating rev
            if rev > (INT_MAX - digit) // 10:
                return 0

            rev = rev * 10 + digit

        return -rev if neg else rev
