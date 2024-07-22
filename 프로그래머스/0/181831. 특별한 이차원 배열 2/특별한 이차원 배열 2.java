class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0 &&j==0) continue;
                if(!(arr[i][j] == arr[j][i])){
                 
                    return 0;
                    
                }
            }
        }
        return answer;
    }
}