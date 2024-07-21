class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(String str: str_list){
            if(str.indexOf(ex)<0)
                answer+=str;
        }
        return answer;
    }
}