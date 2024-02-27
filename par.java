package d;
import java.util.Scanner;
public class par {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int n=0;
	
	System.out.println("Informe o numero");
	n=in.nextInt();
	
	if (n % 2 == 0) {
	System.out.println("par");
		}
	else {
		System.out.println("impar");
	}
}
}
