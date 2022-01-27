import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		Employee E[]=new Employee[3];
		Scanner S=new Scanner(System.in);
		int eno ;
		String na,gen;
		double basic;
		for(int i=0;i<E.length; i++) {
			System.out.println("Enter Enumber,Ename,Egender,Ebasic");
			eno=S.nextInt();
			na=S.next();
			gen=S.next();
			basic=S.nextDouble();
			E[i]=new Employee();
			E[i].Accept(eno, na, gen, basic);
		
		}
		
		for(int i=0;i<E.length;i++) {
			E[i].Display();
		}
		
		S.close();
	}
	

}
