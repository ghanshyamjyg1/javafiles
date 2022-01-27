package CollectionEx;

import java.util.*;
import java.util.List;

class DemoEmp{
	
	public List<Employee> Accept() {
		List<Employee> L=new ArrayList<>();
		L.add(new Employee(1, "A", 5000));
		L.add(new Employee(2, "B", 6000));
		L.add(new Employee(3, "C", 7000));
		L.add(new Employee(4, "D", 8000));
		L.add(new Employee(5, "E", 9000));
		System.out.println(L);
		return L;
	}
	public void Print(List<Employee> L) {
		for(Employee e:L)
		{
			System.out.println(e.empno);
			System.out.println(e.ename);
			System.out.println(e.basic);
		}
	}
	
}

public class MainEmp {
	public static void main(String[] args) {
		DemoEmp d=new DemoEmp();
		List<Employee> A=d.Accept();
		/*for(Employee e:A) {
			System.out.println(e.empno);
			System.out.println(e.ename);
			System.out.println(e.basic);
		}*/
		d.Print(A);
		
		
		
	}

}
