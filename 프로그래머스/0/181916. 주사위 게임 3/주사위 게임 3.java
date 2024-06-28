import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int diceNum[] = new int[] {a,b,c,d};
        int answer=0;
        
        /*
        1. 모두 다 같은 경우                   ex)1,1,1,1
        2. 3개만 같은 경우                     ex)1,1,1,3
        3. 2개가 같고 나머지 2개도 같은 경우     ex)1,1,3,3
        4. 2개가 같고 나머지 2개는 다른 경우     ex)1,1,3,4
        5. 모두 다 다른 경우                   ex)1,2,3,4
        */
       
        Map<String, Integer> dupli = new HashMap<>();
        for(int num : diceNum ){
        String strNum=Integer.toString(num);
            if(!dupli.containsKey(strNum)) {
                 dupli.put(strNum,1);
            }else{
                dupli.replace(strNum,dupli.get(strNum)+1);
            }
        }  
        int case4[]=new int[2];
        int j=0;
        
        
        if(dupli.size()==1){
            //1.
            return 1111*a;
        }else if(dupli.size()==4){
            //5.
            return Integer.parseInt(Collections.min(dupli.keySet()));
        }else if(dupli.size()==3){
                //4
             
                //주사위 수 중 중복되지 않은 값 조회
            for(int i=0;i<diceNum.length;i++){
                if((int)dupli.get(Integer.toString(diceNum[i]))==(1)){
                    case4[j]=diceNum[i];
                    j++;
                }    
            }
                 return case4[0]*case4[1];
                 
        }else{
            for(int i=1;i<=6;i++){
                if(dupli.containsKey(Integer.toString(i))){
                     case4[j]=i;
                     j++;
                }    
            }
            if(dupli.containsValue(2)){
                          // 3
                int p=case4[0];
                int q=case4[1];
                return (p+q)*Math.abs(p-q);
    
        
            }else {
                int p=0;
                int q=0;
                
                if(dupli.get(Integer.toString(case4[0]))==3){ 
                    p=case4[0];
                    q=case4[1];
                }else{ 
                    p=case4[1];
                    q=case4[0];
                }                   
                return (int)Math.pow(10*p+q,2);
            }
        }
    }
}