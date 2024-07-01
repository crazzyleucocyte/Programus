class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2==1){
            for(;n>0;n-=2)
                answer+=n;
        }else{
            for(;n>0;n-=2){
                answer+=Math.pow(n,2);
            }
        }
        
        
        return answer;
    }
}