import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List <String> num = new ArrayList();
        for(int a : arr){
            for(int i = 0; i < a; i++){
                num.add( String.valueOf(a) );
            }
        }
        int[] answer = new int[ num.size() ];
        for(int i = 0; i < num.size(); i++){
            answer[i] = Integer.parseInt( num.get(i) );
        }
        return answer;
    }
}