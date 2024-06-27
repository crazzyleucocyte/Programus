import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
       int[] answer={};
                
        List num = new ArrayList(100);
        
        for(;l<=r;l++){
            if(whattf.wtf(l)){
                num.add(l);
            }
        }
        // System.out.println(num);
        Collections.sort(num);
        if(num.size()==0){
            // answer= new int[1];
             return answer= new int []{-1};
        }
        answer = new int[num.size()];
        for(int i=0;i<num.size();i++){
            answer[i]=(int)num.get(i);
    }
        return answer;
    }
}

class whattf{
   
    static boolean isfive(int a){
        return a==5||a==0 ? true:false;
    }
    
    
    static boolean wtf(int l){
    int one=0;
    int ten=0;
    int hund=0;
    int thousands=0;
    int tenThounds=0;
    int hundThounds=0;
    int milion=0;
        
    if(l<10){
          one= l;
        return isfive(one)? true:false;
   }else if(l<100){
        ten= (int)(l/10);
        one= l-(ten*10);
        // if(l==50){
            // System.out.println(l+" = "+ten+" * 10 + "+one);
        // }
        return isfive(one)&&isfive(ten)? true:false;
      
   }else if(l<1000){
        hund=(int)(l/100);
        ten= (int)((l-hund*100)/10);
        one= l-hund*100-ten*10;
        // System.out.println(l+" = "+hund+" * 100 +"+ten+" * 10 + "+one);
        
        return isfive(one)&&isfive(ten)&&isfive(hund)? true:false;
   }else if(l<10000){
        thousands=(int)(l/1000);
        hund=(int)((l-thousands*1000)/100);
        ten= (int)((l-thousands*1000-hund*100)/10);
        one= l-thousands*1000-hund*100-ten*10;
        // if(l<50000&&l>4500){
       // System.out.println(l+" = "+thousands+" * 1000 +"+hund+" * 100 +"+ten+" * 10 + "+one);
       //  }
        return isfive(one)&&isfive(ten)&&isfive(hund)&&isfive(thousands)? true:false;
     
   }else if(l<100000){
        tenThounds=(int)(l/10000);
        thousands=(int)((l-tenThounds*10000)/1000);
        hund=(int)((l-tenThounds*10000-thousands*1000)/100);
        ten= (int)((l-tenThounds*10000-thousands*1000-hund*100)/10);
        one= l-tenThounds*10000-thousands*1000-hund*100-ten*10;
       //  if(l<60000&&l>55000){
       // System.out.println(l+" = "+tenThounds+" * 10000 + "+thousands+" * 1000 +"+hund+" * 100 +"+ten+" * 10 + "+one);
       //  }
            
        return isfive(one)&&isfive(ten)&&isfive(hund)&&isfive(thousands)&&isfive(tenThounds)? true:false;
      
       
   }else if(l<1000000){
        milion=(int)(l/100000);
       tenThounds=(int)((l-milion*100000)/10000);
        thousands=(int)((l-milion*100000-tenThounds*10000)/1000);
        hund=(int)((l-milion*100000-tenThounds*10000-thousands*1000)/100);
        ten= (int)((l-milion*100000-tenThounds*10000-thousands*1000-hund*100)/10);
        one= l-milion*100000-tenThounds*10000-thousands*1000-hund*100-ten*10;
       //   if(l<550000&&l>547000){
       // System.out.println(l+" = "+milion+" * 100000 + "+tenThounds+" * 10000 + "+thousands+" * 1000 +"+hund+" * 100 +"+ten+" * 10 + "+one);
       //  }
        return isfive(one)&&isfive(ten)&&isfive(hund)&&isfive(thousands)&&isfive(tenThounds)&&isfive(milion)? true:false;

       
   }
                return false;
    
    }
    //각 자리수마다 버림을 하고 5를 더해..?
    /*
    30부터 80까지 라고 할때
    30에서 1의 자리수를 빼오는 방법은?
    30/10=3  -> 10의 자리수
    그럼 31에서 1의 자리수를 빼오는 방법은?
    1의 자리수 =31-((int)(31/10)*10
    10의 자리수 = (int)(31/10)
    100의 자리수= (int)(123/100)
    
    n중 포문.....?????
    */
}