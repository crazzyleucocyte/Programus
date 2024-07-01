class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1=intervals[0][0];
        int b1=intervals[0][1];
        int a2=intervals[1][0];
        int b2=intervals[1][1];
        
        int[] answer = new int [( b1 - a1 )+( b2 - a2 )+ 2];
        for(int i = 0; i < answer.length; i++ ){
            if ( i <= ( intervals [0] [1] - intervals [0] [0] )){
                answer [i] = arr [a1++];
            }else{
            answer [i] = arr [a2++];
            }
        }
        return answer;
    }
}