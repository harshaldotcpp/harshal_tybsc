import java.util.*;
class Patient{
    String name; 
    int age; 
    int patient_oxy_level;
    int HLTC_report;


    Patient(String name ,int age,int patient_oxy,int hltc){
        this.name = name;
        this.age = age;
        this.patient_oxy_level = patient_oxy;
        this.HLTC_report = hltc;
    }


    public static void main(String s[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter patirnt name");
        String name = sc.next();
        System.out.println("enter patirnt age");
        int age = sc.nextInt();
        System.out.println("enter patirnt hrct report");
        int hrtc = sc.nextInt();
        System.out.println("enter patirnt oxy level");
        int oxy = sc.nextInt();

        Patient p = new Patient(name,age,oxy,hrtc);

        if(p.HLTC_report < 95 && p.patient_oxy_level > 10){
            try{
                throw new NullPointerException("patient in danger !!!!"); 
            }
            catch(Exception e){
                System.out.println("patient in danger!!!!");
            }
        }
        else {
            System.out.println("name: " + p.name);
            System.out.println("age: " + p.age);
            System.out.println("patient_oxy_level: "+ p.patient_oxy_level);
            System.out.println("patient hrtc report: " + p.HLTC_report);
        }
        
    }
}
