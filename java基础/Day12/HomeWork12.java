public class HomeWork12{
	public static void main(String[] args) {
		Employee e1 = new Employee("С��",'Ů',32,"���",5678.34);
		Employee e2 = new Employee("С��",'Ů',22);
		Employee e3 = new Employee("����ʦ",15678.34);
		e1.Info();
		e2.Info();
		e3.Info();
	}
}

class Employee{
	String name;
	char gender;
	int age;
	String occupation;
	double salary;
	public Employee(String name,char gender,int age,String occupation,double salary){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
		this.salary = salary;
	}
	public Employee(String name,char gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String occupation,double salary){
		this.occupation = occupation;
		this.salary = salary;
	}

	public void Info(){
		System.out.println("name:" + name + "\tgender:" + gender + "\tage:" + age + "\toccupation:" + occupation + "\tsalary:" + salary);
	}
}