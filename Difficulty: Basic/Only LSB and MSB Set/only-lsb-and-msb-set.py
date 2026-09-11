class Solution:
    def areSet(self, n):
        # code here
        return int(res[0] == res[-1] =='1') if (res:= bin(n)[2:]).count('1') <= 2 else 0

