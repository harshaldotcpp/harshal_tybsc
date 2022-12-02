import java.io.*;

class Student{

	int rollNo;
	String name;
	double percentage;

	Student(int rollNo, String name,double percentage){
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
		return;
	}

	void display(){
		System.out.println("roll no : " + rollNo);
		System.out.println("name : " + name);
		System.out.println("percentage  : " + percentage );
		System.out.println();
	}

	static void sortStudent(Student students[]){

		System.out.println(students.length);
		for(int i=0;i<students.length;i++){
			for(int j=0;j<students.length-1-i;j++){
				if(students[j].percentage < students[j+1].percentage){
					Student temp = students[j+1];
					students[j+1] = students[j];
					students[j] = temp;
				}
			}
		}
		return;
	}



	public static void main(String args[]) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter how many students : ");
		int n = Integer.parseInt(br.readLine());
		Student students[] = new Student[n];
		for(int i=0;i<n;i++){
			System.out.println("enter student roll no " + (i+1) + " ");
			int rn  = Integer.parseInt(br.readLine());
			System.out.println("enter name: ");
			String name  = (br.readLine());
			System.out.println("enter percentage : " );
			double percentage  = Double.parseDouble(br.readLine());
			students[i] = new Student(rn ,name,percentage);
			System.out.println();
		}
		System.out.println("before sort");
		for(int i=0;i<n;i++){
			students[i].display();
		}
	
		Student.sortStudent(students);
		System.out.println("after sort");
		for(int i=0;i<n;i++)
			students[i].display();
		return;
			
	}

}
