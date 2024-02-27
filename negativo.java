package d;
import java.util.Scanner;
public class negativo {
	
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	int n=0; 
	System.out.println("Informe o numero");
	n=in.nextInt();
	if (n<0) {
		System.out.println("Negativo");
	}
	else {
		System.out.println("Positivo"); 
	}
}
}
