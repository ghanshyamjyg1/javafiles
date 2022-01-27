package StaticTutorial;

class Demo{
	int i,j;
	static int k;
	public Demo() {
		i++;
		j++;
		k++;
	}
	public static void Method1() {
		k=7;	
		System.out.println("Method 1");
	}
	public void Method2() {
		i=10;
		k=5;
		System.out.println("Method 2");
	}
	@Override
	public String toString() {
		return "Demo [i=" + i + ", j=" + j +" k="+k+ "]";
	}
}
public class StaticEx {

	public static void main(String[] args) {
//		Demo D1=new Demo();
//		Demo D2=new Demo();
//		System.out.println(D1);
//		System.out.println(D2);
		Demo.k=10;
		Demo.Method1();
		Demo D=new Demo();
		D.Method2();
	}

}
