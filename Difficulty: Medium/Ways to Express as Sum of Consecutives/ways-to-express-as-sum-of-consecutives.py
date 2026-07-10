class Solution:
    def getCount(self, n):
        parts = 2
        base = n - 1
        count = 0
        while base >= parts:
            if base % parts == 0:
                count += 1
            base -= parts
            parts += 1
        return count