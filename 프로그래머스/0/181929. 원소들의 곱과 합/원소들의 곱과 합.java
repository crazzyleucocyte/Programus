class Solution {
    public int solution(int[] num_list) {
       
        int multi=1;//모든 원소의 곱
        int sum=0;//모든 원소의 합
        
        for(int arr : num_list){
             multi*=arr;
             sum+=arr;
        }
        
        
        return (multi<Math.pow(sum,2))? 1:0;
    }
}