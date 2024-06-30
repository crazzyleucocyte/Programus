class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        //StringBuider를 써서 reverse를 쓰는게 나을까?
        //아니면 for문으로 하나한 바꾸는게 나을까
    StringBuilder temp = new StringBuilder(my_string.substring(s,e+1));
        temp.reverse();
        answer=my_string.replace(my_string.substring(s,e+1),temp.toString());
        return answer;
    }
}