class Solution {
    public int solution(String my_string, String target) {
       
        return ( my_string.indexOf(target) < 0) ? 0 : 1;
    }
}