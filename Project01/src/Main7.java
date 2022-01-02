import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		System.out.print(a++ +" ");
		System.out.print(--b +" ");
		
		--a;
		System.out.print(a*b);

	}

}
