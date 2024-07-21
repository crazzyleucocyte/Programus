class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(!isOdd(a)&&!isOdd(b))
            return(int)(Math.pow(a,2)+Math.pow(b,2));
        else if(isOdd(a)&&isOdd(b))
            return Math.abs(a-b);
        else
            return 2*(a+b);
    }
    public boolean isOdd(int num){
        return num%2==0 ? true : false;
    }
}