
public class Employee {

	private int empNo;
	private String name;
	private String gender;
	private double basic;
	
	void Accept(int empNo,String name,String gender,double basic) {
		this.empNo=empNo;
		this.name=name;
		this.gender=gender;
		this.basic=basic;
	}
	void Display() {
		if(basic>7000) {
			System.out.println("Employee No "+empNo);
			System.out.println("Employee Name "+name);
			System.out.println("Employee Gender "+gender);
			System.out.println("Employee Basic "+basic);
		}
		
	}

}
