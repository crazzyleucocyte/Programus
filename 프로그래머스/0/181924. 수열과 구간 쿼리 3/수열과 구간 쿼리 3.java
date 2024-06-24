class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int temp=0;
        for(int i=0;i<queries.length;i++){
            temp=arr[queries[i][0]];
            arr[queries[i][0]]=arr[queries[i][1]];
            arr[queries[i][1]]=temp;
        }
        return answer;
        
        //queries의 각 행은 arr의 인텍스 번호를 나타내고 두 개의 인덱스에 있는 값을 바꾸라는 뜻
    }
}