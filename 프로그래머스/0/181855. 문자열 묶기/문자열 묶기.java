import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map < Integer, Integer > temp = new < Integer, Integer > HashMap();
        for ( int i = 0; i < strArr.length; i++){
            int length = strArr [i].length();
            if (!temp.containsKey(length)){
                temp.put(length,1);
            }else{
                temp.replace(length, temp.get(length) + 1);
            }
        }
        return  Collections.max(temp.values());
    }
}