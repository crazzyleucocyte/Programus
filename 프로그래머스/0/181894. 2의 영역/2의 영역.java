import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] temp = new int[2];
        temp[0]=-1;
        temp[1]=-1;
        int idx=0;
        int answer[]={}; 
        
        for(int i=0;i<arr.length;i++){
            if( arr [i] == 2 && idx != 1){
                temp [0] = i;
                idx++;
            }else if( arr[i] == 2){
                temp [1] = i;
            }
        }
        
        if( temp [0] == -1) 
            return answer=new int[] { -1 };
        else if( temp [1] == -1) 
            return answer=new int[] { arr[ temp[0] ] };
        else{
            return Arrays.copyOfRange( arr, temp[0], temp[1]+1);
        }
        
    }
}