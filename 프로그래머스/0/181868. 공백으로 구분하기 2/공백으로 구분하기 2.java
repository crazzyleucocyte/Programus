import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        List <String> str_list = new ArrayList();
       for(String str : my_string.split(" ")){
           if(!str.equals("")) 
           str_list.add(str);
       }
        return str_list.toArray(new String[0]);
    }
}