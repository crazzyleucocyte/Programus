import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //arr 배열에서 쿼리스의 [i][0]의 값, [i][1]의 값을 인덱스 번호로 하여
        // 그 사이에 있는 값 중 [i][2] 보다 큰 수중 가장 작은 수를 뽑아내자.
        // List <Integer>arrList = new ArrayList();
        // for(int l=0;l<arr.length;l++){
        //     arrList.add(arr[l]);
        // }
        
        int[] answer = new int[queries.length];
        
        for(int i =0; i<queries.length;i++){
            int[]query = queries[i];
            List quer= new ArrayList();
            
            for(int j=query[0];j<=query[1];j++){
                if(arr[j]>query[2]){
                quer.add(arr[j]);
                }
            }
            Collections.sort(quer);
            if(quer.size()==0){
                answer[i]=-1;
            }else{
            answer[i]=(int)quer.get(0);
              
            }
        }
        return answer;
    }
}