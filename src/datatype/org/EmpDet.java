package datatype.org;

public class EmpDet {
	private void empDetails() {
		  short empId=12345;
		  String empName="karthika";
		  String empEmail="karthikapreethi03@gmail.com";
		  long empPhoneNo=1234567890l;
		  float empSalary=45678.778665f;
		  String empGender="female";
		  String empCity="Erode";
		  
		  System.out.println(empId);
		  System.out.println(empName);	  
		  System.out.println(empEmail);	 
		  System.out.println(empPhoneNo);	  
		  System.out.println(empSalary);
		  System.out.println(empGender);
		  System.out.println(empCity);
		 
		  
	}
			  
	public static void main(String[] args) {
		EmpDet d=new EmpDet();
		d.empDetails();
	}
}





