class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        //s의 길이가 4 혹은 6인경우 true 아닐 경우 false
        if(s.length()==4||s.length()==6) answer=true;
        else answer=false;
        
        //try에서 예외가 없을 경우 기본 answer값 true를 return
        try{
        	//s에서 정수를 int로 바꿔주는 pareInt를 사용하여 정수가 아닌 자료형이 있을 경우 예외 발생 
            int number=Integer.parseInt(s);
            
            //numberFormatException이외에 예측 못한 오류 발생 가능성이 있을지도 모르니 Exception으로 작성하였음 
        }catch(Exception e){
        	//예외가 발생할 경우 false를 return
            answer=false;
        }
        /*아쉬운 점 
         * s의 길이가 4 혹은 6이 아닐 경우에도 try문이 돌아가서 불필요한 코드 진행 발생 
         */
        
        return answer;
    }
}