import java.util.Scanner;

class Pat2{
	void Upper(int n) {
		// First Part
		for(int i=1;i<=n; i++) {
			for(int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void Lower(int m) {
		//Lower part
			for(int i=m; i>0; i--) {
				for(int j=m-i; j>=0; j--) {
					System.out.print(" ");
				}
				for(int k=1; k<=2*i-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
}

public class Pattern2 {

	public static void main(String[] args) {
		Pat2 P2=new Pat2();
//		Scanner S= new Scanner(System.in);
//		int up,low;
		
		P2.Upper(6);
		P2.Lower(5);
		
		
		
	}

}
