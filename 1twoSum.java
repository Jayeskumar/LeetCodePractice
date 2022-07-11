class twoSum{
    //naive solution
    public int[] twoSumNaive(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};

                }
            }

        }

    }
    //time complexity O(n^2)
    //space complexity O(1)
    //hashmap solution
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complemet)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
    }
    //time complexity O(n)
    //space complexity O(n)
    
}