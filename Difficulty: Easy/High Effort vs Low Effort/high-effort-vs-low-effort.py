class Solution:
    def maxTask(self, h: list[int], l: list[int]) -> int:
        prevprev = 0
        prev = max(h[0], l[0])
        curr = prev
        
        for i in range(1, len(h)):
            curr = max(h[i] + prevprev, l[i] + prev)
            prevprev = prev
            prev = curr
            
        
        return curr