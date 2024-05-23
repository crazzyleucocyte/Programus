class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String answerForward = my_string.substring(0,s);
        String answerBackward = my_string.substring(s+overwrite_string.length(),my_string.length());
        
        answer=answerForward+overwrite_string+answerBackward;
      
        
        
        
        
    
        
        
        
        return answer;
    }
}