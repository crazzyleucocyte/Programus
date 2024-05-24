
class Solution {
    public int solution(int a, int b) {
        int answer=0;
        String st_a=String.valueOf(a);
        String st_b=String.valueOf(b);

        int ab=Integer.parseInt(st_a+st_b);
        int ba=Integer.parseInt(st_b+st_a);
        
        if(ab>=ba)answer=ab;
        else answer=ba;
        return answer;
    }
}