class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        switch(ineq+eq){//문자열끼리 더하면 시간복잡도가 증가한다 
            case ">=": return n>=m ? 1:0;
                
            case "<=": return n<=m ? 1:0;
                
            case ">!": return n>m ? 1:0;
                
            case "<!": return n<m ? 1:0;
                
            default: return 0;
                
        }
       
    }
}