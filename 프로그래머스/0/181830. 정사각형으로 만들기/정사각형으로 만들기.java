import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int mode=(arr.length>arr[0].length)?1:0; //1: 각 행의 뒤에 0추가    0: 열의 개수많큼 0추가(?)
        if(mode==1){
            answer = new int[arr.length][arr.length];
            for( int i =0;i<arr.length;i++){
                answer[i]=Arrays.copyOf(arr[i],arr.length);
            }
            return answer;
        }
        else if(mode==0){
            answer = new int[arr[0].length][arr[0].length];
             for( int i =0;i<arr[0].length;i++){
                 if(i<arr.length)
                answer[i]=Arrays.copyOf(arr[i],arr[i].length);
                
            }
            return answer;
            
        }
        else{
            return arr;
        }
        
        
        
        
        
    
    }
}