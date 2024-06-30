import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        String string[]= new String[my_string.length()];
        
        for(int i=0;i<my_string.length();i++){
            string[i]=my_string.substring(i);
        }
        Arrays.sort(string);
        return string;
    }
}