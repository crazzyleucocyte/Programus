class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int op=Integer.parseInt(""+a+b);
        int multi=2*a*b;
        answer=(op>=multi)?op:multi;
        
        return answer;
    }
}