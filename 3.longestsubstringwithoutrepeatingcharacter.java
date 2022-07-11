class LongestSubStringWithoutRepeatingCharacter{
    //Naive solution
    public int lengthOfLongestSubstringNaive(String s){
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(allUnique(s,i,j)){
                    ans=Math.max(ans,j-i);
                }
            }
        }
        return ans;
    }
    public boolean allUnique(String s,int start,int end){
        Set<Character> set =new HashSet<>();
        for(int i=start;i<end;i++){
            Character c=s.charAt(i);
            if(set.contains(c)){
                return false
            }
            set.add(c);
        }
    }
}