import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        int [] answer = {};
        for(int i = 0; i < query.length; i++){
            if( i % 2 == 0 ){
                arr = Arrays.copyOf ( arr, query[i] + 1 );
            }else{
                arr = Arrays.copyOfRange( arr, query[i], arr.length );
            }
        }
        answer = Arrays.copyOf ( arr, arr.length );
        return answer;
    }
}