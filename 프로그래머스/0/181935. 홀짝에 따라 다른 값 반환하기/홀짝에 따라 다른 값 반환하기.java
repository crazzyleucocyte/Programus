class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=n;n>0;n-=2)
            answer+=(n%2==0) ? (Math.pow(n,2)) : n;
      
        return answer;
    }
}