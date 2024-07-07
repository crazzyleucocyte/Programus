class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        
        for(String str : myString.split("")){
            answer.append(str.equalsIgnoreCase("a") ? str.toUpperCase() : str.toLowerCase());
        }
        return answer.toString();
    }
}