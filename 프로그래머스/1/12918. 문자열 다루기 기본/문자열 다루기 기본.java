class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int ch;
        try{
        for(int i =0;i<s.length();i++){
            ch=(int)s.charAt(i);
            if (ch<48||ch>57){
                answer=false;
                break;
            }
        }
        }catch(Exception e){}
        
        
        return answer;
    }
}