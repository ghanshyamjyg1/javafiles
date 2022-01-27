import java.util.Scanner;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int en;
		String na,g;
		double b;
		Employee E1=new Employee(); 
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Employee Number");
		en=S.nextInt();
		System.out.println("Enter Employee Name");
		na=S.next();
		System.out.println("Enter Employee Gender");
		g=S.next();
		System.out.println("Enter Employee Basic");
		b=S.nextDouble();
		
		E1.Accept(en, na, g, b);
		
		Employee E2=new Employee();
		
		System.out.println("Enter Employee Number");
		en=S.nextInt();
		System.out.println("Enter Employee Name");
		na=S.next();
		System.out.println("Enter Employee Gender");
		g=S.next();
		System.out.println("Enter Employee Basic");
		b=S.nextDouble();
		
		
		E2.Accept(en, na, g, b);
		E1.Display();
		E2.Display();

	}

}
