import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i=0;
        for(;i<10;i++){
            if(arr.length<=Math.pow(2,i)){
                break;
            }
        }
        return Arrays.copyOf(arr,(int)Math.pow(2,i));
    }
}