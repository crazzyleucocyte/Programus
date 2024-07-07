import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String temp[] = (myStr.replace('a','A').replace('b','A').replace('c','A')).split("A");
       
        if(temp.length == 0) return new String [] {"EMPTY"};
        List <String> answer = new ArrayList();
        for(int i = 0; i < temp.length; i++){
            if(!(temp[i].equals("")))   answer.add(temp[i]); 
        }
        return answer.toArray(new String[0]);
    }
}