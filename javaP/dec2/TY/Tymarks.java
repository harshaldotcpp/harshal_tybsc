package TY;
public class Tymarks{

    int theory;
    int practical;

    public Tymarks(){}

    public Tymarks(int t,int p){

        this.theory = t;
        this.practical = p;


    }

    public void display(){
        System.out.println("theory mark: " + this.theory);
        System.out.println("practical mark: " + this.practical);
    }
    
     public int total(){
        return practical + theory;
    } 
}
