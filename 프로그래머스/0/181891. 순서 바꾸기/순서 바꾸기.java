import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int [] answer = new int [ num_list.length ];
        int temp [] = new int [ num_list.length ];
        temp = Arrays.copyOf ( num_list, n );
        
        System.arraycopy ( num_list, n, answer, 0, num_list.length - n );
        
        System.arraycopy ( temp, 0, answer, num_list.length - n, temp.length );
        
        return answer;
    }
}