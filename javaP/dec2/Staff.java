import java.util.*;
public class Staff{

    int id;
    String name;

    public Staff(){}

    public Staff(int id,String nama){
        this.id = id;
        this.name = name;

        return;
    }

}


class OfficeStaff{
    String department;

    OfficeStaff(String name,int id , String department){
        super(id,name);
        this.department = department;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name ");
        String name = sc.next();
        System.out.println("enter id ");
        int id = sc.nextInt();
        System.out.println("enter department ");
        String dept = sc.next();
        
        OfficeStaff s = new OfficeStaff(name,id,dept);
    }
}


