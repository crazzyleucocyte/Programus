class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char str[]= my_string.toCharArray();
        
        for(int i=0;i<str.length;i++){
            if(Character.isUpperCase(str[i])){
                answer[str[i]-65]+=1;
            }else{
                answer[str[i]-71]+=1;
            }
        }
        
        return answer;
    }
}