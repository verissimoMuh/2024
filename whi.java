package d;
import java.util.Scanner;
public class whi {
public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
       int senhaCorreta = 2002;

       while (true) {
           System.out.print("Digite a senha: ");
           int senha = scanner.nextInt();

           if (senha == senhaCorreta) {
               System.out.println("correta");
               break;
           } else {
               System.out.println("Senha Invalida");
           }
       }
       
       scanner.close();
   }
}
	

