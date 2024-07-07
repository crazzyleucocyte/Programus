class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String cal [] = binomial.split(" ");
        int a = Integer.parseInt(cal[0]);
        int b = Integer.parseInt(cal[2]);
        switch(cal[1]){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        return answer;
    }
}