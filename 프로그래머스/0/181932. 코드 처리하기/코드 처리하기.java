class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode =false;
        int i=0;
        
       for(char cod : code.toCharArray()) {
           if(cod=='1') mode=!mode;
    	   else if(i%2==0) answer= (mode) ? (answer+"") : (answer+answer.valueOf(cod)) ;
    	   else if(i%2==1)answer = (mode)? (answer+answer.valueOf(cod)) : (answer+"");
           else answer+="";
           i++;
       }
        if(answer.isEmpty()) return "EMPTY";
       return answer;
    }   
} 