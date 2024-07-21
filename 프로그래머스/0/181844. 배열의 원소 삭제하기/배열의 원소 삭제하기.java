import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> deletelist = new ArrayList();
        for(int i=0;i<delete_list.length;i++)
            deletelist.add(delete_list[i]);
        int[] answer = new int [arr.length];
        int idx=0;
        for( int i =0;i<arr.length;i++){
            if(!deletelist.contains(arr[i])){
                answer[idx++]=arr[i];
            }      
        }
        return Arrays.copyOf(answer,idx);
    }
}