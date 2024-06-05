    import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer>hash = new HashMap(participant.length);
        int value;
        for(int i =0;i<participant.length;i++){
        if(hash.containsKey(participant[i])){
            value= (int)hash.get(participant[i]);
            hash.replace(participant[i],++value);
        }else
            hash.put(participant[i],1);
            }
        
        for(int i =0;i<completion.length;i++){
        if(hash.get(completion[i])!=1){
            value= (int)hash.get(completion[i]);
            hash.replace(completion[i],--value);
        }else{
            hash.remove(completion[i]);
        }
        }
        System.out.println(hash);
        Set <String>answerset=hash.keySet();
        Iterator<String> it = answerset.iterator();
        answer = it.next();
        
        return answer;
    }
}