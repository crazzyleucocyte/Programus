class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        StringBuilder temp = new StringBuilder();
        int num = k;
        int idx=0;
        for(int i = 0; i<picture.length;i++){
            for(String str2 : picture[i].split("")){
                temp.append(str2.repeat(k));
            }
            answer[idx++]=temp.toString();
            temp.setLength(0);
            if(num!=1){
                num--; 
                i-=1;
            }else{
               num=k;
            }   
        }
        return answer;
    }
}