class Solution {
    public StringBuilder solution(String my_string, int[] index_list) {
        StringBuilder strb = new StringBuilder();
        char [] my_char=my_string.toCharArray();
        for(int idx : index_list){
            strb.append(my_char[idx]);
        }
        return strb;
    }
}