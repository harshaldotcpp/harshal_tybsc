import SY.*;
import TY.*;
import java.util.*;
class Student{
    String name;
    int roll_no;
    Symarks sym;
    Tymarks tym;

    Student(){}

    Student(String name,int roll_no){
        this.name = name;
        this.roll_no = roll_no;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter computer science marks:");
        int c_marks = sc.nextInt();
        System.out.println("enter math marks:");
        int m_mark = sc.nextInt();
        System.out.println("enter electronic marks:");
        int e_mark = sc.nextInt();


        System.out.println("enter theory marks:");
        int theory = sc.nextInt();

        System.out.println("enter practical marks:");
        int practical = sc.nextInt();


        sym = new Symarks(c_marks,m_mark,e_mark);
        tym = new Tymarks(theory,practical);   
        
        return;
    }
    
    void grade(){
        int totalsy = sym.total();
        int totalty = tym.total();

        double per = ((totalsy + totalty)/35 + 20) * 100;

        if(per >= 75){
            System.out.println("distiction pass: percetage:"+ per);
        }
        else if(per >= 60 && per <= 75){
            System.out.println("passed first class pass");
        }
        else if(per >= 50 && per < 60){
            System.out.println("passed second class pass");
        }
        else System.out.println("you failed better luck next time :)" );


        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of students");
        int n = sc.nextInt();
        Student students[] = new Student[n];

        for(int i=0; i<n; i++){
            System.out.println("enter name of student " + i+1);
            String name = sc.next();
            System.out.println("enter rollno  of student " + i+1);
            int roll_no = sc.nextInt();
            students[i] = new Student(name,roll_no);
            System.out.println();
        }
    }
} 
