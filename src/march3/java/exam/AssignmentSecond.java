package march3.java.exam;

public class AssignmentSecond {

	public static void main(String[] args) {

		University u = new University(13, "Ram", 13, "TCC", "Hurst", "Science", "UTA", "Arligton");

		u.dispalyAdress();
		u.dispalyCollegeName();
		u.dispalyDepartment();
		u.dispalyCollegeName();
		u.displayLabel();
		u.dispalyUniversityAddress();
		u.displayRollNO();
		u.dispalyUniversityName();

	}

}

class Student {
	int roolNo;// instace variable//Global variable
	String name;
	int label;

	public Student(int roll, String nam, int label) {
		this.roolNo = roll;
		this.name = nam;
		this.label = label;

	}

	public void displayRollNO() {
		System.out.println("My roll no is " + roolNo);

	}

	public void displayName() {
		System.out.println("The name of student is " + name);
	}

	public void displayLabel() {
		System.out.println("Label of student is " + label);
	}

}

class College extends Student {

	String collegeName;
	String address;
	String deparment;

	public College(int roll, String nam, int label, String collegeName, String address, String depament) {
		super(roll, nam, label);
		this.collegeName = collegeName;
		this.address = address;
		this.deparment = deparment;

	}

	public void dispalyCollegeName() {
		System.out.println("The college name is " + collegeName);
	}

	public void dispalyAdress() {
		System.out.println("The college address is " + address);
	}

	public void dispalyDepartment() {
		System.out.println("The deparment name is " + deparment);
	}

}

class University extends College {

	String universityName;
	String universityAddress;

	public University(int roll, String nam, int label, String collegeName, String address, String depament,
			String uname, String uAddress) {
		super(roll, nam, label, collegeName, address, depament);
		this.universityName = uname;
		this.universityAddress = uAddress;

	}

	public void dispalyUniversityName() {
		System.out.println("The university name is " + universityName);
	}

	public void dispalyUniversityAddress() {
		System.out.println("The university address is " + universityAddress);
	}
}