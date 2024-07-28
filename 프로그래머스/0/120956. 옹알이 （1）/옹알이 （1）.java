import java.util.regex.Matcher;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String bybe : babbling){
            try{
                bybe=bybe.replaceAll("(aya)|(ye)|(woo)|(ma)","1");
                //System.out.println(bybe);
                Integer.parseInt(bybe);
                answer++;
            }catch(NumberFormatException e){
                //System.out.print("exception, ");
            }
        }
        
        
        
        return answer;
    }
}