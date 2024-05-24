class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4||s.length()==6) answer=true;
        else answer=false;
        try{
            int number=Integer.parseInt(s);
            
        }catch(Exception e){
            answer=false;
        }
        
        
        return answer;
    }
}