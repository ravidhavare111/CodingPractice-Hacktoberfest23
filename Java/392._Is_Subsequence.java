https://leetcode.com/problems/is-subsequence/description/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sP = 0;
        int tP = 0;
        int count = 0;

        if(s.length()  == 0){
            return true;
        }

        while(sP<s.length()  &&  tP<t.length()){
            if(s.charAt(sP) == t.charAt(tP)){
                sP++;
                tP++;
                count++;
            }
            else{
                tP++;
            }
        }

        if(count== s.length()){
            return true;
        }
        
        return false;


    }
}
