import java.io.*;
class Employee{

   	private int id;
	private String name,deptname;
	private float salary;
	static int count = 0;

	Employee(){
		this.id = 0;
		this.name = "no name";
		this.deptname = "no deptname";
		this.count++;
        return;
	}

	Employee(int id,String name,String deptname,float salary){
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        this.count++;
        return;
	}

    void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("deptname: "+deptname);
        System.out.println("salary: "+salary);
        System.out.println();
        return;
    }

    static void displayCount(){
        System.out.println("count is "+count);
        return;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(1,"harshal","SE",85000);


        int id = Integer.parseInt(br.readLine());
        String name = br.readLine();
        String deptname  = br.readLine();
        float salary = Float.parseFloat(br.readLine());
        
        Employee emp3 = new Employee(id,name,deptname,salary);
        emp1.display();
        emp2.display();
        emp3.display();
        Employee.displayCount();
    }

}
