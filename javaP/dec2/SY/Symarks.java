package SY;
public class Symarks{
    int compsci_mark;
    int math_mark;
    int elec_mark;

    public Symarks(){}

    public Symarks(int compsci,int math,int elec){

        this.compsci_mark = compsci;
        this.math_mark = math;
        this.elec_mark = elec;


    }

    public void display(){
        System.out.println("computer science mark: " + this.compsci_mark);
        System.out.println("math science mark: " + this.math_mark);
        System.out.println("electronic  mark: " + this.elec_mark);
    }
    
     public int total(){
        return compsci_mark + math_mark + elec_mark;
    } 
}
