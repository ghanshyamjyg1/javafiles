
public class Student {
	private int regNo;
	private String studentName;
	private int m1,m2,m3;
	
	void Accept(int regNo, String studentName,int m1,int m2,int m3) {
		this.regNo=regNo;
		this.studentName=studentName;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void Print() {
		System.out.println("Registration Number :"+regNo);
		System.out.println("Student Name :"+studentName);
		System.out.println("Marks 1 :"+m1);
		System.out.println("Marks 2 :"+m2);
		System.out.println("Marks 3 :"+m3);
		System.out.println("Average :"+Average());
		System.out.println("Result :"+Result());
	}
	float Average() {
		int t=m1+m2+m3;
		float avg=t/3;
		return avg;	
	}
	String Result() {
		float a=Average();
		if(a>=80) 
			return "A Grade";
		else if(a>=70)
			return "B Grade";
		else
			return "Fail";
	}

}
