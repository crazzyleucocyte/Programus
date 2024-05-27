class Solution {
    public int solution(int a, int b, int c) {
       /*
       세 숫자가 모두 같은경우
       세 숫자 중 두 숫자만 같은 경우
       세 숫자가 모두 다른 경우
       */
        if(a==b && b==c && c==a){
            return (a+b+c)*(a*a+b*b+c*c)*(int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
        }else if(a!=b && b!=c && a!=c){
            return a+b+c;
        }else{
            return (a+b+c)*(a*a+b*b+c*c);
        }
    }
}