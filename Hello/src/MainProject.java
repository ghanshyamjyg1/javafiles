import java.util.Scanner;

class Project {
	private int projectId;
	private String projectDescription;
	private int projectDuration;
	private int perDayCost;
	
	void Accept(int projectId,String projectDescription,int projectDuration,int perDayCost) {
		this.projectId=projectId;
		this.projectDescription=projectDescription;
		this.projectDuration=projectDuration;
		this.perDayCost=perDayCost;
	}
	
	void Print() {
		System.out.println("projectId :"+projectId);
		System.out.println("projectDescription :"+projectDescription);
		System.out.println("projectDuration :"+projectDuration);
		System.out.println("Project cost :"+Cost());
	}
	long Cost() {
//		projectDuration =110
		
		int nom=projectDuration/30;	//3
		int nod=projectDuration-nom*30;	//20
		long total= nom*200000+nod*perDayCost;
		return total;
		
	}

}
class MainProject{
	public static void main(String[] args) {
		/*Project P=new Project();
		Scanner S=new Scanner(System.in);
		int pId,pDur,perDayCo;
		String pDesc;
		System.out.println("Enter project Id :");
		pId=S.nextInt();
		System.out.println("Enter Project Description :");
		pDesc=S.next();
		System.out.println("Enter project Duration :");
		pDur=S.nextInt();
		System.out.println("Enter Per Day Cost :");
		perDayCo=S.nextInt();
		P.Accept(pId, pDesc, pDur,perDayCo);
		P.Print();*/
		
		//Main class for Bank Program
		/*Bank B=new Bank();
		Scanner S=new Scanner(System.in);
		String accNo;
		String name;
		long bal;
		System.out.println("Enter Account Number :");
		accNo=S.next();
		System.out.println("Enter Holder Name :");
		name=S.next();
		System.out.println("Enter Account Balance");
		bal=S.nextLong();
		B.Accept(accNo, name, bal);
		B.Print();*/
		
		//Main class for Student Program
//		Scanner S=new Scanner(System.in);
		/*Student St=new Student();
		System.out.println("Registration Number :");
		int regNo=S.nextInt();
		System.out.println("Student Name :");
		String studentName=S.next();
		
		System.out.println("Enter Marks 1 :");
		int m1=S.nextInt();
		System.out.println("Enter Marks 2 :");
		int m2=S.nextInt();
		System.out.println("Enter Marks 3 :");
		int m3=S.nextInt();
		St.Accept(regNo, studentName, m1, m2, m3);
		St.Print();*/
		
		
		//Main class for Book class
		Scanner S=new Scanner(System.in);
		Book B=new Book();
		System.out.println("Enter Book Id,Name,Author,Price and No. of Books");
		int id=S.nextInt();
		String name=S.next();
		String author=S.next();
		float price=S.nextFloat();
		int noOfBooks=S.nextInt();
		
		B.Accept(id, name, author, price, noOfBooks);
		B.Print();
		
	}
}
