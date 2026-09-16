class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #set(nums)
        return (len(nums)>len(set(nums)))