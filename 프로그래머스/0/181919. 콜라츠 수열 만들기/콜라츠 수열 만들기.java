import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List num = new ArrayList();
        num.add(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }else{
                n=n*3+1;
            }
            num.add(n);
        }
        answer = new int[num.size()];
        for(int i = 0; i<num.size();i++){
            answer[i]=(int)num.get(i);
        }
            
        return answer;
    }
}