class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> finalList=new ArrayList<>();
    List<Integer>tempList=new ArrayList<>();
    int j=1;
    int target=0;
    int first=0;int second=0;int sum=0;
        for (int i=0;i<nums.length;i++){
            target=0-nums[i];
            first=i+1;
            second=i+2;
            
            while (j>=first && first<nums.length-1){
            sum=nums[first]+nums[second];
                if (sum==target){
                    tempList.clear();
                    tempList.add(nums[i]);
                    tempList.add(nums[first]);
                    tempList.add(nums[second]);
                    Collections.sort(tempList);
                    if (!finalList.contains(tempList)){
                    finalList.add(new ArrayList<>(tempList));}
                    }
                first++;
                second++;
                j++;
                
                
            }
        }
    return finalList;}
}
