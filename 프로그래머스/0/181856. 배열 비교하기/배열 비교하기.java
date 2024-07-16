class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        boolean same = (arr1.length==arr2.length) ? true : false;
        
        if(!same){
            return (arr1.length  >arr2.length) ? 1 : -1;
        }
        
        
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1 [i];
            sum2 += arr2 [i];
        }
        

        
        return (sum1==sum2) ? 0 : ((sum1>sum2) ? 1:-1);
    }
}