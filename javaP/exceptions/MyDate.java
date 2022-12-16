//property: month year date
//display dd,mm,yyyy, trow error if date is invalid 
import java.util.*;

class InvalidDate extends Exception{
    InvalidDate(String str){
       super(str); 
   } 
}



class MyDate{
    MyDate(int d,int m,int y){
        dd = d; 
        mm = m;
        yy = m;

    }

    void isValid(){
        if(m > 12){
           try{
             throw new InvalidDate("enter y less then 12");
           }
           catch(Exception e){
             System.out.println(e); 
           }
       }   else{
              System.out.println("date is valid");
           }
       

        if(mm % 2 == ){
                if(d > 31){
                    try{
                      throw InvalidDate("invalid date");
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }
       }
      else{
                if(d > 28){
                    try{
                      throw InvalidDate("invalid date");
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }
           else{
              System.out.println("date is valid");
           }

      }  
   }

    public static void main(String args[] ){
         Scanner sc = new Scanner(System.out); 
         int d,m,y; 
         System.out.println("enter dd,yy,mm");
         d = sc.nextInt(); 
         m = sc.nextInt(); 
         y = sc.nextInt(); 

        MyDate date = new MyDate(d,m,y);
        
    }
}
