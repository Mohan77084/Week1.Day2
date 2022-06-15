package week1.day2;

public class EmployeeDetails {
	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeNameandEmpID();
		String EmployeeAddress = obj.getEmployeeAddress("1/21,AnnaNagar,Chennai");
		System.out.println(EmployeeAddress);
		obj.printEmployeeSalary();
		long PhoneNumber = obj.printPhoneNumber(9879634512L);
		System.out.println(PhoneNumber);
	}
	public void printEmployeeNameandEmpID() {
		System.out.println("Name & 123");	
	}
	String getEmployeeAddress(String a) {
		return a;
	}
	public void printEmployeeSalary() {
		System.out.println("400000");	
	}
	long printPhoneNumber(long c) {
		return c;
	}
	
}
