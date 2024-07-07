import java.util.*;
class Solution {
    public String[] solution(String myString) {
      
        List <String> str = new ArrayList();
        for(String strSplit : myString.split("x")){
            if( !strSplit.equals("")) str.add(strSplit);
        }
        Collections.sort(str);
        return str.toArray(new String[0]);
    }
}