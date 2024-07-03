import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        if(str_list.length == 1 && ( str_list [0].equals( "l" ) || str_list [0].equals( "r" ))){
            return new String [] {};
        }else if(str_list.length == 1){
            return new String [] {};
        }
        for( int i = 0; i< str_list.length; i++ ){
            if( str_list[i].equals("l")){
                return Arrays.copyOf( str_list, i );
            }else if( str_list[i].equals("r")){
                if(i==str_list.length-1) {return new String [] {};}
                return Arrays.copyOfRange( str_list, i+1, str_list.length );
            }
        }
        return str_list;
    }
}