package JavaBasics;

public class Employeedata {
	
	
	private int ssn;
	private String empName;
	private int empAge;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employeedata emp= new Employeedata();
		
		emp.setEmpName("Sireesha");
		emp.setEmpAge(27);
		emp.setSsn(647);
		
		System.out.println("the employee name"   + emp.getEmpName());
		System.out.println("the employee name"   + emp.getEmpAge());
		System.out.println("the employee name"   + emp.getSsn());
	}
	
	
	

	public int getSsn() {
		return ssn;
	}





	public void setSsn(int ssn) {
		this.ssn = ssn;
	}





	public String getEmpName() {
		return empName;
	}





	public void setEmpName(String empName) {
		this.empName = empName;
	}





	public int getEmpAge() {
		return empAge;
	}





	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}





	

}
