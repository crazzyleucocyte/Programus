class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for(int[] query : queries){
           
            for(int j =query[0];j<=query[1];j++){
                if(j%query[2]==0)arr[j]++;
            }
        }
        return arr;
    }
}