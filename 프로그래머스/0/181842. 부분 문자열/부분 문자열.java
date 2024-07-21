class Solution {
    public int solution(String str1, String str2) {
       
        return str2.indexOf(str1) < 0 ? 0 : 1;
    }
}