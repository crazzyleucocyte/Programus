class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for(int i =0;i<myString.length();i++){
            if((int)myString.charAt(i)>=97 && (int)myString.charAt(i)<=107){
                answer.append("l");
            }else{
                answer.append(myString.charAt(i));
            }
        }
        return answer.toString();
    }
}