import java.util.Scanner;

class Pat1{
	void display(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
public class Pattern1 {

	public static void main(String[] args) {
		Pat1 p1=new Pat1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Dimentions");
		int n=sc.nextInt();
		p1.display(n);
		sc.close();
	}

}
