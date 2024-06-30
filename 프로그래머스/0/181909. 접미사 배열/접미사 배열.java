import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> string= new ArrayList();
        for(int i=0;i<my_string.length();i++){
            string.add(my_string.substring(i));
        }
        Collections.sort(string);
        return string.toArray(new String[0]);
    }
}