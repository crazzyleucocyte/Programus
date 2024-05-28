import java.time.LocalDate;
class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer=0;
        LocalDate Lodate1=LocalDate.of(date1[0],date1[1],date1[2]);
        LocalDate Lodate2=LocalDate.of(date2[0],date2[1],date2[2]);
        
        if(Lodate1.isBefore(Lodate2))  answer=1;
        else if(Lodate1.isAfter(Lodate2))  answer=0;
        else if(Lodate1.isEqual(Lodate2)) answer=0;
        
        
        // int answer = (date1[0] >= date2[0]?
        //              (date1[1] >= date2[1]?
        //              (date1[2] >= date2[2]?0:1):1):1);
        // System.out.println(answer);
       return answer;
    }
}