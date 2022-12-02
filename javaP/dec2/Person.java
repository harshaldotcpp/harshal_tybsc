import java.util.*;
class Person{
    String last_name;
    String middle_name;
    String first_name;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name"); 
        this.first_name = sc.next();
        System.out.println("enter middle  name"); 
        this.middle_name = sc.next();
        System.out.println("enter last  name"); 
        this.last_name = sc.next();
        
        String fl = this.middle_name.substring(0,1);
        String rem = this.middle_name.substring(1,middle_name.length());
        this.middle_name = fl.toUpperCase() +rem;

        System.out.println(middle_name);
    }

    void display(){
        System.out.println("Output:"); 
        System.out.println("last name: "+last_name); 
        System.out.println("first name: " + first_name); 
        System.out.println("middle name: "+middle_name); 
    }

    public static void main(String argS[]){
        Person p = new Person();
        p.accept();
        p.display();
    }
}
