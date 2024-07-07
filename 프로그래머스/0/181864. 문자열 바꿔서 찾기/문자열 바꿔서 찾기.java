class Solution {
    public int solution(String myString, String pat) {
        String temp = myString.replace('A','1').replace('B','A').replace('1','B');
        
        if(temp.contains(pat)) return 1;
        return 0;
    }
}