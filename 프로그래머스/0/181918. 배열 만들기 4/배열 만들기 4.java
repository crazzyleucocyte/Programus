import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        List <Integer>stk = new ArrayList();
        
        for(int i =0;i<arr.length;i++ ){
            
            if(stk.size()==0){
                stk.add(arr[i]);
                
            }else if(stk.get(stk.size()-1)<arr[i]){
                stk.add(arr[i]);
                
            }else if(stk.get(stk.size()-1)>=arr[i]){
                stk.remove(stk.size()-1);
                i--;
            }
            
        }
            int answer[]=new int[stk.size()];
            for(int i=0;i<stk.size();i++){
                answer[i]=(int)stk.get(i);
            }
        return answer;
    }
}