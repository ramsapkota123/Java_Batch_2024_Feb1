package march3;

public class Employee {
	public static void main(String[] args) {
		HRManager hr=new HRManager();
		hr.addEmployee();
		hr.work();
		hr.getSalary();
		
		
	
	}
	public void Work() {
		System.out.println("getting working end of month in a company");
	}
	public void getSalary() {
		System.out.println("Getting salary");
	}

}
class HRManager extends Employee{
	public void work() {
		System.out.println("I am in HRmanager page");
	}
	public void addEmployee() {
		System.out.println("hello i am in method of add employee ");
	}
	
	
}