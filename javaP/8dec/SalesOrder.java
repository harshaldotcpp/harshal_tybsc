import java.util.*;

abstract class Order {
    int id;
    String desc;

    abstract void accept();
    abstract void display();
}


class PurchaseOrder extends Order{
   String cname;
    String vname;
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter perchese order ");
        System.out.println("enter id,description,customer name,vendor name");
        id = sc.nextInt();
        desc = sc.next();
        cname = sc.next();
        vname = sc.next();
    }
    
    void display(){
        System.out.println("id: " + id);
        System.out.println("description " + desc);
        System.out.println("cname  " + desc);
        System.out.println("vname " + desc);

        return;
    }
}



class SalesOrder  extends Order{
   String custname;
    String vendername;
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter perchese order details");
        System.out.println("enter id,description,customer name,vendor name");
        id = sc.nextInt();
        desc = sc.next();
        custname = sc.next();
        vendername = sc.next();
    }
    
    void display(){
        System.out.println("id: " + id);
        System.out.println("description " + desc);
        System.out.println("custname  " + desc);
        System.out.println("vendername " + desc);

        return;
    }

    public static void main(String args[]){
        Order so[] = new SalesOrder[3]; 
        Order po[] = new PurchaseOrder[3]; 

        for(int i=0; i<3; i++){
            so[i] = new SalesOrder();
            so[i].accept();
        }
        for(int i=0; i<3; i++){
            po[i] = new PurchaseOrder();
            po[i].accept();
        }
        for(int i=0; i<3; i++)
            po[i].display();

        for(int i=0; i<3; i++)
            po[i].display();
    }
}



