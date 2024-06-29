class Solution {
    public int solution(String number) {
        int answer = 0;
        char num []=number.toCharArray();
        for(int n:num){
            answer+=(n-48);
        }
        return answer%9;
    }
}